
public class MethodEx01 {
	
	int var1;
	int var2;
//	��� ���� Ȥ�� instance ����(��ü�� �����ؾ߸� �����ϴ� ����)
	
//	���� �޼ҵ� Ȥ�� instance method(��ü�� �����ؾ߸�, ������ ��ü�� ���ؼ��� ���� ����)
	public int sum(int a, int b) {
//  �Ű� ����
	return a + b;
	}
	
	public int times(int a, int b) {
	return	a * b;
	}
		
	public static void main(String[] args) {
		MethodEx01 me = new MethodEx01();
		int result = me.sum(77, 11);
		System.out.println(result);
		
		result = me.times(77, 11);
		System.out.println(result);
	}

}
