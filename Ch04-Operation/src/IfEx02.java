
public class IfEx02 {

	public static void main(String[] args) {
	
		int a;
		a= 12;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
//				input이라는 이름으로 
		
		System.out.println("정수형 데이터 하나를 입력해주세요. >");
		
		a = input.nextInt();
		
		
		if(a%2==1) {
//		홀수이면 {를 수행
			System.out.println("홀수입니다.");
	}else
//		그렇지 않으면 else를 수행
		System.out.println("짝수입니다.");
		
		System.out.println("프로그램 종료");}


}