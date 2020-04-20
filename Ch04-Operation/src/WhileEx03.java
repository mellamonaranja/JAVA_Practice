
public class WhileEx03 {

	public static void main(String[] args) {
		
//		1부터 100까지의 누적합을 구하는 프로그램
//		합계는:
//		1-100까지 출력 함수 먼저 만들고, 100까지 누적해서 합해라
//		expectation=5050
		int su = 0;
		int sum = 0;
		
		while(su<=100) {
			System.out.println("su:" + su);
			sum += su;
			su++;
		}
		System.out.println("sum : " + sum);
	}

}
