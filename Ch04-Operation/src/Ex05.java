
public class Ex05 {

	public static void main(String[] args) {
//		특정 숫자범위에서 지정한 배수의 합계 구하는 프로그램
//		원하는 숫자 3개 입력받기
//		시작숫자, 끝숫자, 합계를 구할 숫자(배수)
		
//		예상 출력결과
//		범위의 시작 숫자 입력, 범위의 끝 숫자 입력, 합계를 구할 숫자 입력
//		ex)1, 50, 7-->1~50내에서 7의 배수의 합계는 196이 나옴
		
		int numStart;
		int numEnd;
		int numMultiple;
		
		int i;
		int sum = 0;
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("시작 숫자 입력>");
		numStart = scanner.nextInt();
		System.out.println("끝 숫자 입력>");
		numEnd = scanner.nextInt();
		System.out.println("합계 배수 입력>");
		numMultiple = scanner.nextInt();
		
		i = numStart;
		while(i<=numEnd) {
			if(i%numMultiple == 0) {
			System.out.printf("%d\n", i);
			sum = sum + i;
		}
		
		i++;
		}
System.out.printf("%d ~ %d 범위에서 %d 배수의 합계 : %d", numStart, numEnd, numMultiple, sum);
		
	}

}

