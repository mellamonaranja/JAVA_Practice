
public class TextEx02 {
	
	public static int plus(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {

		int result;
		
		result = plus(10, 20);
		if(result == 30) {
			System.out.println("TEST SUCCESS");
		}else {
			System.out.println("TEST FAIL");
		}
		
		
		result = plus(30, 30);
		if(result == 50) {
			System.out.println("TEST SUCCESS");
		}else {
			System.out.println("TEST FAIL");
		}
		
		
	}

}
