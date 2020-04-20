
public class OverloadingEx02 {

	public static void main(String[] args) {
		OverloadingEx02 oe= new OverloadingEx02();
		oe.getLength("2000");
//		길이를 구하고 싶을 때
		oe.getLength(200);
		oe.getLength(3.14f);

	}
public void getLength(String s) {
	System.out.println("입력한 값의 길이" + s.length());
	
	
}
public void getLength(int n) {
	String s =String.valueOf(n);
	getLength(s);
}

public void getLength(float n) {
	String s=String.valueOf(n);
	getLength(s);
//	string을 인자로 받는 getLength(String s)의 s가 호출되어짐
}
}
