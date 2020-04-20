/*class Number{
	int num;
//	생성자
	public Number() {
		num=30;
		
		System.out.println("생성자 호출됨!");
	}
	public void addNum(int n) {
		num += n;
	}

	public int getNum() {
		return num;
		
	}
}


public class ObjectEx03 {

	public static void main(String[] args) {
		
		Number myNumber1=new Number();
		Number myNumber2=new Number();
		
		System.out.println("myNumber1 메소드 호출 전 값:" + myNumber1.getNum());
		myNumber1.getNum();
		
		System.out.println("myNumber2 메소드 호출 전 값:" + myNumber2.getNum());
		
		instMethod(myNumber1);
		System.out.println("myNumber1 메소드 호출 전 값:" + myNumber1.getNum());
		System.out.println("myNumber2 메소드 호출 전 값:" + myNumber2.getNum());
		
		instMethod(myNumber2);
		System.out.println("myNumber1 메소드 호출 전 값:" + myNumber1.getNum());
		System.out.println("myNumber2 메소드 호출 전 값:" + myNumber2.getNum());

	}
	
	public static void instMethod(Number number) {
		
		number.addNum(10);
		
	}

}
*/
