
public class MethodEx03 {

	public int add(int a, int b) {
		return a + b;
	}
//	반환값 있는 method
	
	public void print() {
		System.out.println("the method doesnt need to be return");

	}
//	반환값 없는 method, void로 생성

	
	
	public static void main(String[] args) {
	
		MethodEx03 me = new MethodEx03();
			System.out.println(me.add(10,20));
			me.print();
		

	}

}
