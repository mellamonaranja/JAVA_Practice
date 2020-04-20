// 입력형태  출력형태 
public class FunctionEx02 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		tellTime(10, 48);
		byEveryone();
		tellTime(18, 30);
		
		int min = 40;
		tellTime(20, min);
		
		byEveryone();
		
		System.out.println("프로그램 종료");
	}
	public static void tellTime(int hour, int minute) {
//		hour, minute라는 데이터를 받아서 int변수로 사용하겠다
//		hour, minute라는 두 개의 입력 데이터가 있고, void 즉 출력형태가 없음
		System.out.println("즐거운 하루입니다.");
		System.out.println("현재 시간은" + hour + "시 입니다.");
		System.out.println("현재 시간은" + minute + "분 입니다.");
	return;
//	함수 종료 및 
	}

	public static void byEveryone() {
		
		System.out.println("내일 뵙겠습니다.");
	}
	
}
