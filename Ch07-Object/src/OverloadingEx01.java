
public class OverloadingEx01 {

	public void stringLength(String s) {
		System.out.println("�Է��� ���� ����" + s.length());
	
	}
	
	public void intLength(int a) {
//		������ ���̰� ���� ũ�Ⱑ �ִ�. �� 100>10
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ����" + s.length());
		
	}
	
	public void floatLength(float f) {
		String s=String.valueOf(f);
		System.out.println("�Է��� ���� ����: " + s.length());
	}
	
	
	public static void main(String[] args) {
		OverloadingEx01 oe = new OverloadingEx01();
		oe.stringLength("10000");
		oe.intLength(1000);
		oe.floatLength(3.14f);
		
		

	}

}
