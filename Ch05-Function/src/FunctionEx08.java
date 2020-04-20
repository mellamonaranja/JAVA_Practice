
public class FunctionEx08 {

	public static void main(String[] args) {
		System.out.println("3 factorial :" + factorial(3));
		System.out.println("7 factorial :" + factorial(7));
		System.out.println("12 factorial :" + factorial(12));
		
			}
	public static int factorial(int n) {
		if(n==1) {
			return 1;
			
		}else {
			return n*factorial(n-1);
//			3*f(2)-->3은 1이 아니므로 
//			2*f(1)-->2은 1이 아니므로 
//			1이 넣으면 n=1 ∴1이 반환됨
		}

	}

}
