
public class FunctionEx07 {
	public static int normalSum(int n) {
		int result = 0;
		
		for(int i=1;i<=n;i++) {
			result +=i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(normalSum(10));
		System.out.println(recursiveSum(10));

	}
	
	public static int recursiveSum(int n) {
		if(n==1) {
			return 1;
			
		}return n + recursiveSum(n-1);
	}
//	return�� 10�� ������, recursiveSum(n-1)���� 9�� ����
//	return�� 9�� ������, recursiveSum(n-1)���� 8�� ����

}
