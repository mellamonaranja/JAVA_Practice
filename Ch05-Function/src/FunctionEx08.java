
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
//			3*f(2)-->3�� 1�� �ƴϹǷ� 
//			2*f(1)-->2�� 1�� �ƴϹǷ� 
//			1�� ������ n=1 ��1�� ��ȯ��
		}

	}

}
