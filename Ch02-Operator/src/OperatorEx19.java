
public class OperatorEx19 {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int max;
		int min;
		
		max = (a > b) ? a : b;
		min = (a < b) ? a : b;
				
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
//		조건식(true of false) ? 참값 : 거짓값
//				absX=(x >= 0) ? x : -x;
		
		System.out.println("최대값 : " + max);
		
		System.out.println("최소값 : " + min);

	}

}
