
public class ObjectEx01 {
// 클래스의 구성 요소: 멤버필드(멤버 변수, 멤버 상수), 멤버 메소드, 생성자 함수
	
	int var1;
//	instance 변수
	final int NUM_TWO = 2;
//	instance 상수
	
	public int sum(int a, int b) {
		return a+b;
//		instance method
//		static이 있지 않으면 다른 객체들 접근 불가능
//		static은 객체 생성 없이 사용 가능, 공유 개념으로 별도의 공간에 생성되기 때문에, 이 공간에 다른 객체들이 접근 가능
	}
	
	public ObjectEx01() {
//		클래스명과 동일한 이름을 가진 함수형태
//		객체 생성자, 다른 것은 함수와 같지만 반환 타입(ex int)이 없음, 객체 생성 역할만 하기 때문
//		데이터를 초기화해주는 역할만 함
	}

	
	public static void main(String[] args) {
		int number;
		ObjectEx01 oe1;
		ObjectEx01 oe2;
//		ObjectEx01 클래스의 객체 변수 oe1, 2을 만듦
		
		oe1 = new ObjectEx01();
		oe2 = new ObjectEx01();
		
		System.out.println(oe1);
		System.out.println(oe2);
		
//		oe1과 oe2는 서로 다른 공간, new키워드로 새롭게 만들었기 때문에, new할 때마다 메모리 공간에 새로운 객체가 만들어짐
		
		System.out.println(oe1.var1);
		System.out.println(oe1.NUM_TWO);
		
		System.out.println(oe2.var1);
		System.out.println(oe2.NUM_TWO);
		
		oe1.var1 = 10;
		System.out.println(oe1.var1);
		System.out.println(oe2.var1);
//		oe1의 var1에 10을 넣어 oe1과 oe2를 각각 출력했더니 oe1만 바뀜. 즉 서로는 각각 다른 객체
		
		int result = oe1.sum(20, 40);
//		return a+b;에서 반환된 값을 int형 result에 담음
		System.out.println("oe1 멤버 메소드 호출 후 반환 값:"+result);
//		out도 .연산자로 통해 멤버를 호출할 수 있음
		
		result = oe2.sum(200, 400);
		System.out.println("oe2 멤버 메소드 호출 후 반환 값:"+result);
		
	}

}
