
public class MethodEx01 {
	
	int var1;
	int var2;
//	멤버 변수 혹은 instance 변수(객체를 생성해야만 존재하는 변수)
	
//	↓멤버 메소드 혹은 instance method(객체를 생성해야만, 생성된 객체를 통해서만 접근 가능)
	public int sum(int a, int b) {
//  매개 변수
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
