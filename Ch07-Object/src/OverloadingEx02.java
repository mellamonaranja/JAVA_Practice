
public class OverloadingEx02 {

	public static void main(String[] args) {
		OverloadingEx02 oe= new OverloadingEx02();
		oe.getLength("2000");
//		���̸� ���ϰ� ���� ��
		oe.getLength(200);
		oe.getLength(3.14f);

	}
public void getLength(String s) {
	System.out.println("�Է��� ���� ����" + s.length());
	
	
}
public void getLength(int n) {
	String s =String.valueOf(n);
	getLength(s);
}

public void getLength(float n) {
	String s=String.valueOf(n);
	getLength(s);
//	string�� ���ڷ� �޴� getLength(String s)�� s�� ȣ��Ǿ���
}
}
