
public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50, 60, 70};
//		{}�� �迭 �ʱ�ȭ�� ����ÿ��� ������

		System.out.println("�迭�� ���:" + a);
//		a�� ����� �ּҰ��� ��µ� : [I@372f7a8d
		System.out.println(a);
		
		char[] c = {'J','A'};
		System.out.println("�迭�� ���:" + c);
//		�� �迭�� �������� ��µ� : [C@2f92e0f4
		System.out.println(c);
//		�迭�� ����ϰԵǸ� �� �迭�� �������ִ� ��� ���ڰ� ��µ�. ��!��!��!��!��!��!
//		c�� �ּҸ� ������. �ּҴ� [C@2f92e0f4�� ������
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
						
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
						
		}
		
	}

}
