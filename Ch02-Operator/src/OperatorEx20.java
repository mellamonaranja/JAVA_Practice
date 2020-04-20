
public class OperatorEx20 {
	
	public static void main(String[] args) {
		
		char ch1 = 'b';
		String msg1;
		
//		msg = (65 < ch < 90) ? "대문자입니다" : "소문자입니다";
		msg1 = (65 <= ch1) && (ch1 <= 90) ? "대문자입니다" : "소문자입니다";

		System.out.println(msg1);
		
		String msg2;
		char ch2 = 'B';
		msg2 = (65 <= ch2) && (ch2 <= 90) ? "대문자입니다" : "소문자입니다";
		
		
		
//		char result a = "소문자입니다.";
//		char result b = "대문자입니다";


		System.out.println("판단한 결과: " + msg1 );
		System.out.println("ch: " + (int)ch1);
		
		System.out.println("판단한 결과: " + msg2 );
		System.out.println("ch: " + (int)ch2);
		
		
		
	}

}
