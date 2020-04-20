
public class FunctionEx03 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int result = plus(3,7);
		System.out.println("3과 7의 합:" + result);
		System.out.println("3.5의 제곱:" + square(3.5));
		byExit();
		
		
		System.out.println("프로그램 끝");

	}
	
	public static int plus(int num1, int num2) {
		int plusResult;
		plusResult = num1 + num2;
		return plusResult;
//		plusResult의 값은 호출한 곳(위 plus(3,7)으로 반환됨
//		입력형식 : (int num1, int num2)
//		출력형식 : int
		
	}
	public static double square(double num) {
		return num*num;
//		double과 double을 곱했으니 반환되는 데이터도 double임
//		∴ public static 뒤에 double
				
	}
	public static void byExit() {
		System.out.println("프로그램 종료!!!");
	}

}

