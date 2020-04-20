
public class ObjectEx02 {

	public static void main(String[] args) {
		Number myNumber = new Number();
//		오직 number클래스의 객체만 myNumber에 담을 수 있음
		
		System.out.println("메소드 호출 전 값:" + myNumber.getNum());
		
		myNumber.addNum(10);
		System.out.println("메소드 호출 후 값:" + myNumber.getNum());

		System.out.println(myNumber);
		
		instMethod(myNumber);
		System.out.println("참조값을 인자로 메소드 호출한 후의 값:" + myNumber.getNum());
	}

	public static void instMethod(Number number) {
		number.addNum(7);
//		number클래스 객체의 참조값을 받을 수 있는 number를 만들어 줌
	}
//	객체 생성 없이 호출하기 위해 static을 붙임
	
}

class Number{
	int num=0;
//	num는 멤버변수=instance변수
//	member method이기도 하고 instance method이기도 함. 객체를 생성해야만 하는 method이기 때문
	
	
	public void addNum(int n) {
		this.num += n;
//		이 num은 멤버변수=instance변수
	}
	
	public int getNum() {
		return num;
	}
//	public Number(){
//  }
//	기본 생성자, 별도로 생성자를 만들지 않았을 때는 자바가 기본 생성자를 만들어줌
	
}
