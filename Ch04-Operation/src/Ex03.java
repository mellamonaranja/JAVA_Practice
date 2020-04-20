
public class Ex03 {

	public static void main(String[] args) {
//	switch,case를 통해서 사칙연산 프로그램 만들기
//	첫번째 숫자 입력, 두번째 숫자 입력,수행할 연산자 입력(+-*/%), 결과값 출력
		
		int i=0;
		int j=0;
		int result = 0;
		String operator;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("첫번째 숫자 입력>");
	
		i=input.nextInt();
		
		System.out.println("두번째 숫자 입력>");
		j=input.nextInt();
		
		
		System.out.println("연산자 입력>");
		operator = input.next();
		
		switch(operator) {
		case "+" : 
			result= (i + j);
			break;
		case "-" : 
			result= (i - j);
			break;
		case "*" : 
			result= i * j;
			break;
		case "/" : 
			result= (i / j);
			break;
		case " % " : 
			result= (i % j);
			break;
			default : 
				System.out.println("잘못된 연산자 입력");
				
			}
		System.out.println(i+operator+j + "=" + result);
	

	}

}
