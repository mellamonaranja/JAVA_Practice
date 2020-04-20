
public class OperatorEx18 {

	public static void main(String[] args) {
	
		int x = 10;
		int absX;
		
//		조건식(true of false) ? 참값 : 거짓값
		absX=(x >= 0) ? x : -x;
		System.out.println("x=10일 때 x의 절대값: " + absX);
		
		int y = -20;
		int absY;
		
		absY=(y>=0) ? y : -y;
		System.out.println("y=-20일 때 y의 절대값: " + absY);

	}

}
