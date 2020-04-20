
public class ConsoleEx03 {

	public static void main(String[] args) {
		
		String source = "1 3 5 7 9";
//		문자열 데이터(String) 13579를 source에 담음
		
		java.util.Scanner scanner = new java.util.Scanner(source);
//		문자열을 입력 scanner라는 입력 장치를 통해서 소스로
		
//		scanner.NextInt()
//		문자열 13579를 하나씩 가져와서 int형으로 변환
		
		int num1 = scanner.nextInt();
//		1을 num1에 저장
		int num2 = scanner.nextInt();
//		3을 num2에 저장
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		System.out.printf("문자열에 저장된 %d, %d, %d, %d, %d \n", num1, num2, num3, num4, num5);
		int sum = num1 + num2 + num3 + num4 + num5;

		System.out.printf("문자열에 저장된 %d, %d, %d, %d, %d의 합은 %d입니다.\n", num1, num2, num3, num4, num5, sum);
		
	}

}
