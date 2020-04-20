
public class FunctionEx04 {

	public static void main(String[] args) {
		dividedby(4,2);
		dividedby(4,0);
//		int를 0으로 나누기가 불가 arithmetic exception발생
		dividedby(6,2);
		dividedby(8,0);
		
		int returnResult = divide(6,2);
		System.out.println("리턴된 값: " + returnResult);
		
		returnResult = divide(6,0);
		System.out.println("리턴된 값: " + returnResult);
//		int result = 0;이렇게 초기화된 값이 보여짐

	}
	
	public static void dividedby(int num1, int num2) {
		
		if(num2==0) {
			System.out.println("(알림)0값으로 나눌 수 없습니다");
			return;
//			현재 메소드를 종료하고 그 이하에 있는 코드(System.out.println("나눗셈 결과:" + (num1/num2));)는 수행하지 않고 함수 호출한 곳(dividedby(4,0);)으로 프로그램의 흐름을 이동시킨다
		}
		
		System.out.println("나눗셈 결과:" + (num1/num2));
	}

	public static int divide(int num1, int num2) {
//		divide : 지역 변수, 즉 이 함수 밖에서는 사용 불가능
		int result = 0;
		if(num2==0) {
			System.out.println("(알림)0값으로 나눌 수 없습니다");
			
		}else {
			result = num1/num2;
		}
		return result;
		
	}
	
}
