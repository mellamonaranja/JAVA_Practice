
public class WhileEx04 {

	public static void main(String[] args) {
//		누적값 구하는 프로그램
//		while방법론 사용으로 입력한 값의 누적합을 0을 입력하기 전까지 계속 구해주세요.(입력한 값을 계속 저장하고 있어야 함)
//		0입력 후 종료 후에도 누적합 한 번 더 출력해주세요.
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		int i = 1;
//		while(반복)에 사용할 변수 지정하기. i를 반복문에 사용할 예정
		int sum = 0;
		System.out.println("더할 숫자를 입력해주세요.>");
		
		while(i>0)  {
//		while반복문 안에서 문자를 입력받을 예정. i>0 아니면 i!=0
			i = input.nextInt();
			sum= sum + i;
//			sum에 i를 더한 다음 sum에 집어넣음
			
			System.out.println("누적합계 sum : " + sum);		
//			while반복문 안에서 계속 출력해주기
				}
		System.out.println("반복을 종료합니다.");
		System.out.println("누적 합계" + sum);
		
		input.close();
//		input을 열어줬기 때문에 여기서 닫아줌


}
}