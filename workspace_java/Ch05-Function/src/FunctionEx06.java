
public class FunctionEx06 {

	public static void main(String[] args) {
//		args는 {안에서만 사용가능한 지역 변수
		callNum();
		
		int result = square(7);
//		square는 int num으로 아래에서 지정해줬기 때문에, square()에 숫자 넣어줘야 함
		System.out.println(result);

		for(int num=1;num<10;num++) {
			System.out.println(num);
		}
//		num은 for안에서만 사용 가능한 지역 변수
		
	}
	public static void callNum() {
		int num=30;
		System.out.println(num);
//		num은 callNum에서만 사용할 수 있는 지역 변수
	}
	
	public static int square(int num) {
		int result = num*num;
		return result;
	}
//	매개 변수로 num을 선언해줬고, num은 square안에서만 사용 가능한 지역 변수

}
