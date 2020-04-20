
public class SwitchEx04 {

	public static void main(String[] args) {
		
		int n = 3;
//		int n에 3을 담음
		
		switch(n) {
			case 1:
			System.out.println("First");
//			break;
			case 2:
				System.out.println("Second");
//				break;
			case 3:
				System.out.println("Third");
//				break;
			case 4:
				System.out.println("Fourth");
//				break;
			case 5:
				System.out.println("Fifth");
//				break;
			case 6:
				System.out.println("Sixth");
//				break;
			case 7:
				System.out.println("Seventh");
//				break;
				default:
					System.out.println("Ordinal Number");
					break;
		}
				System.out.println("프로그램종료");	
//				break가 없으면 해당 출력문자부터 마지막까지 다 출력해줌, 즉 시작만 있고 종료가 없음. 따라서 break를 사용해야 함
//				break를 통해 그룹화하는 것도 가능
		}

	}


