
public class ObjectEx01 {
// Ŭ������ ���� ���: ����ʵ�(��� ����, ��� ���), ��� �޼ҵ�, ������ �Լ�
	
	int var1;
//	instance ����
	final int NUM_TWO = 2;
//	instance ���
	
	public int sum(int a, int b) {
		return a+b;
//		instance method
//		static�� ���� ������ �ٸ� ��ü�� ���� �Ұ���
//		static�� ��ü ���� ���� ��� ����, ���� �������� ������ ������ �����Ǳ� ������, �� ������ �ٸ� ��ü���� ���� ����
	}
	
	public ObjectEx01() {
//		Ŭ������� ������ �̸��� ���� �Լ�����
//		��ü ������, �ٸ� ���� �Լ��� ������ ��ȯ Ÿ��(ex int)�� ����, ��ü ���� ���Ҹ� �ϱ� ����
//		�����͸� �ʱ�ȭ���ִ� ���Ҹ� ��
	}

	
	public static void main(String[] args) {
		int number;
		ObjectEx01 oe1;
		ObjectEx01 oe2;
//		ObjectEx01 Ŭ������ ��ü ���� oe1, 2�� ����
		
		oe1 = new ObjectEx01();
		oe2 = new ObjectEx01();
		
		System.out.println(oe1);
		System.out.println(oe2);
		
//		oe1�� oe2�� ���� �ٸ� ����, newŰ����� ���Ӱ� ������� ������, new�� ������ �޸� ������ ���ο� ��ü�� �������
		
		System.out.println(oe1.var1);
		System.out.println(oe1.NUM_TWO);
		
		System.out.println(oe2.var1);
		System.out.println(oe2.NUM_TWO);
		
		oe1.var1 = 10;
		System.out.println(oe1.var1);
		System.out.println(oe2.var1);
//		oe1�� var1�� 10�� �־� oe1�� oe2�� ���� ����ߴ��� oe1�� �ٲ�. �� ���δ� ���� �ٸ� ��ü
		
		int result = oe1.sum(20, 40);
//		return a+b;���� ��ȯ�� ���� int�� result�� ����
		System.out.println("oe1 ��� �޼ҵ� ȣ�� �� ��ȯ ��:"+result);
//		out�� .�����ڷ� ���� ����� ȣ���� �� ����
		
		result = oe2.sum(200, 400);
		System.out.println("oe2 ��� �޼ҵ� ȣ�� �� ��ȯ ��:"+result);
		
	}

}
