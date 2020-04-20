
public class SwitchEx03 {

	public static void main(String[] args) {
		String s = "Java";
//		string s라는 변수에 Java(혹은 아래에 해당하는 어느 문자)라는 문자 넣어줌-->이후에 "자바 출력하였습니다."가 출력 예정
		
		switch(s) {
		case "code":
//			문자열에 해당하는 code인지 확인
			System.out.println("코드 출력하였습니다.");
			break;
		case "Java":
			System.out.println("자바 출력하였습니다.");
			break;	
		case "Python":
			System.out.println("파이썬 출력하였습니다.");
			break;	
		default : 
			System.out.println("해당하는 문자열이 아닙니다.");
			break;
		}

	}

}
