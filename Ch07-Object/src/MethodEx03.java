
public class MethodEx03 {

	public int add(int a, int b) {
		return a + b;
	}
//	��ȯ�� �ִ� method
	
	public void print() {
		System.out.println("the method doesnt need to be return");

	}
//	��ȯ�� ���� method, void�� ����

	
	
	public static void main(String[] args) {
	
		MethodEx03 me = new MethodEx03();
			System.out.println(me.add(10,20));
			me.print();
		

	}

}
