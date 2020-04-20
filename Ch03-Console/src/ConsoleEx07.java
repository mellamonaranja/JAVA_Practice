
public class ConsoleEx07 {
	
	public static void main(String []args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
//		키보드를 통해 입력받기 위한 입력장치 만들기. 입력장치명은 변수이므로 아무 이름이나 선언 가능
//		System.in:키보드를 통해 입력
		
		System.out.println("좋아하는 숫자(정수) 입력>>");
		
		int n = input.nextInt();
//		엔터치기 전 입력값
		
		System.out.println("n: " + n);
		System.out.println("원하는 요일을 입력하세요(영문 소문자) > ");
		
		input.nextLine();
//		버퍼를 비우기 위한 입력, ()에 아무것도 안 넣음
		String str = input.nextLine();
//		한 라인 전체를 입력받기, str변수 만들기 즉, 엔터 전 버퍼를 비워주는 작업
		
		System.out.println("str: " + str);
		
		
	
		
		
		
	}

}
