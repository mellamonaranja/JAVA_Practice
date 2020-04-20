
public class SwitchEx01 {

	public static void main(String[] args) {
		
		int a;
//		a라는 변수 선언(만들어 줌)
		System.out.println("정수형 숫자를 입력하세요. >");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		a = input.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1 입력하였습니다.");
			break;
//			case가 1이라면 break전까지의 문장을 수행하게 됨. 
		case 2:
			System.out.println("2 입력하였습니다.");
			break;
		case 3:
			System.out.println("3 입력하였습니다.");
			break;
		case 4:
			System.out.println("4 입력하였습니다.");
			break;
		case 5:
			System.out.println("5 입력하였습니다.");
			break;
			default:
				System.out.println("1-5 중에서 입력하세요.");
			break;
			
			
		
		}
		

	}

}
