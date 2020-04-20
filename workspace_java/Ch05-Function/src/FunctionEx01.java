// 입력형태 o 출력형태 x

public class FunctionEx01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		tellTime(10);
//		10이 hour에 저장됨. public static void tellTime(int hour){ 수행한 다음 return을 만나서 호출한 곳으로 감. 
//		return 이후에 프로그램은 계속 이어짐
		
		tellTime(18);
		

		System.out.println("프로그램 종료");
	}
	public static void tellTime(int hour){
//()으로 입력받음. 그럴려면 저장할 공간이 있어야 함. int에 담아줌. {}안에서 hour라는 이름으로 사용하겠다
//		static형태의 method
//		이 함수 코드 안에서의 데이터를 hour라는 이름으로 사용

		System.out.println("즐거운 하루입니다.");
		System.out.println("현재 시간은" + hour + "시 입니다.");
		
		return;
//		프로그램 호출한 곳으로 간 다음 프로그램이 계속 이어지게 됨
}
}