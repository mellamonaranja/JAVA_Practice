
public class OverloadingEx03 {

	public static void main(String[] args) {
		
		OverloadingEx03 oe = new OverloadingEx03();
		oe.getLength(1000);
		oe.getLength(3.14f);
		oe.getLength("���ѹα�");
		oe.getLength(1000,3.14f);
		oe.getLength(3.14f,10000);
		oe.getLength("���ѹα�", 3.14f);
		oe.getLength(3.14f, "���ѹα�");
		oe.getLength(1000, 3.14f,"���ѹα�" );
	}
	
	public void getLength(String s) {
		System.out.println("�Է��� ���� ����" + s.length());
	}

	public void getLength(int i) {
		String s = String.valueOf(i);
		getLength(s);
		
	}
	public void getLength(float f) {
		String s = String.valueOf(f);
		getLength(s);
		
	}
	public void getLength(float f, int a) {
		String s=String.valueOf(f) + String.valueOf(a);
		getLength(s);
	}
	
	public void getLength(int a, float f) {
		String s = String.valueOf(a) + String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(String str, float f) {
		String s = String.valueOf(f) + str;
		getLength(s);
	}
	
	public void getLength(float f, String str) {
		String s = String.valueOf(f) + str;
		getLength(s);
	}
	
	public void getLength(int i, float f, String str) {
		String s = String.valueOf(i) + String.valueOf(f) + str;
		getLength(s);
	}
	
}
