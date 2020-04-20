
public class ConsoleEx04 {
	
	public static void main(String []args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
//		키보드 리소스 : System.in
//		키보드를 리소스로 하는 입력장치 scanner가 생성됨
		
		System.out.println("숫자를 입력해주세요>>");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		int sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.printf("키보드로 입력된 %d, %d, %d, %d, %d의 합은 %d 입니다. \n", num1, num2, num3, num4, num5, sum);
	
		scanner.close();
		
		
	}

}
