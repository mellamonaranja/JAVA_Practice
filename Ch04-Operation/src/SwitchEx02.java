
public class SwitchEx02 {

	public static void main(String[] args) {
	
		char a = 'A';
//		캐릭터 a에 A를 저장
		
		switch(a) {
		case 'A':
			System.out.println("A출력하였습니다.");
			break;
		case 'B':
			System.out.println("B출력하였습니다.");
			break;
		case 'C':
			System.out.println("C출력하였습니다.");
			break;
			default :
				System.out.println("A,B,C가 아닌 문자입니다.");
				break;
		
		}

	}

}
