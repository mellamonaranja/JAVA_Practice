
public class ConsoleEx09 {

	public static void main(String[] args) {

//		동전교환기
//		사용자로부터 입력된 액수만큼 동전으로 전환
//		500원, 100원, 50원, 10원짜리 동전으로 교환해주는 프로그램
//		제한사항:고액의 동전을 먼저 바꿔줘서 동전의 총 개수를 최소화해주세요.
//		교환할 돈 : 6,470원, 7,530원
		
//		1)1개 변수 선언, 결과 저장 변수 선언
	int num1;
	int n500;
	int n100;
	int n50;
	int n10;
	
//	2)입력장치 생성
	java.util.Scanner scanner = new java.util.Scanner(System.in);


//	3)입력장치로 숫자를 입력받아 변수에 저장
	System.out.print("교환할 돈을 입력하세요>>");
	num1 = scanner.nextInt();
	
	System.out.println("동전 교환 중...");
		
	
//	4) num1을 각각 동전으로 나누기
	n500 = num1 / 500;
	num1 = num1 % 500;
	n100 = num1 / 100;
	num1 = num1 % 100;
	n50 = num1 / 50;
	num1 = num1 % 50;
	n10 = num1 / 10;
	num1 = num1 % 10;
	
	System.out.printf("500원의 개수는 %d입니다.\n", n500);
	System.out.printf("100원의 개수는 %d입니다.\n", n100);
	System.out.printf("50원의 개수는 %d입니다.\n", n50);
	System.out.printf("10원의 개수는 %d입니다.\n", n10);
	System.out.printf("1원의 개수는 %d입니다.\n", num1);
	
	
	
			
		
	

	}

}
