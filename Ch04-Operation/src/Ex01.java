
public class Ex01 {

	public static void main(String[] args) {
//		switch case를 이용하여 문자열 비교를 통해 요일 출력하는 프로그램
//		영문으로 요일 입력 시 한글로된 요일을 출력해주세요
//		원하는 요일을 입력하세요(영문 소문자) > 
		
	String s;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("원하는 요일을 입력하세요>");
		s=input.next();
//		s를 input을 통해 가져옴, 따라서 s=input.nextInt();는 작동하지 않음 'Int'를 삭제해야함
		
		switch(s) {
		case "monday":
		case "Monday":
            System.out.println("월요일");
			break;
		case "tuesday":
		case "Tuesday":
			System.out.println("화요일");
			break;	
		case "wednesday":
		case "Wednesday":
			System.out.println("수요일");
			break;	
		case "thursday":
		case "Thursday":
			System.out.println("목요일");
		case "friday":
		case "Friday":
			System.out.println("금요일");
		case "saturday":
			System.out.println("토요일");
		case "sunday":
			System.out.println("일요일");		
		default : 
			System.out.println("정확한 요일을 입력하세요>");
			break;
		}

	}

}
