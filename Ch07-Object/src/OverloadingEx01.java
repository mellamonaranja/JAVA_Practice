
public class OverloadingEx01 {

	public void stringLength(String s) {
		System.out.println("입력한 값의 길이" + s.length());
	
	}
	
	public void intLength(int a) {
//		정수는 길이가 없고 크기가 있다. 즉 100>10
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이" + s.length());
		
	}
	
	public void floatLength(float f) {
		String s=String.valueOf(f);
		System.out.println("입력한 값의 길이: " + s.length());
	}
	
	
	public static void main(String[] args) {
		OverloadingEx01 oe = new OverloadingEx01();
		oe.stringLength("10000");
		oe.intLength(1000);
		oe.floatLength(3.14f);
		
		

	}

}
