/*class Number{
	
	int num;
	
	public Number() {
		
	}
	public Number(int number) {
		num = number;
		
//		생성자, num의 값을 초기화
		
		System.out.println("생성자 호출됨!!");
		System.out.println("전달된 인자값" + number);
	}
	
	public void addNum(int n) {
		num +=n;
	}
	
	public int getNum() {
		return num;
		
//		addNum, getNum = method
	}
}


public class ObjectEx04 {

	public static void main(String[] args) {
		
		Number myNumber1=new Number(10);
		Number myNumber2=new Number();
		Number myNumber3=new Number(20);
		
		System.out.println("myNumber1의 값" + myNumber1.num);
		System.out.println("myNumber2의 값" + myNumber2.num);
		System.out.println("myNumber3의 값" + myNumber3.num);
		
		instMethod(myNumber1);
		
		System.out.println("myNumber1의 값" + myNumber1.num);
		System.out.println("myNumber2의 값" + myNumber2.num);
		System.out.println("myNumber3의 값" + myNumber3.num);
		
		instMethod(myNumber2);
		System.out.println("myNumber1의 값" + myNumber1.num);
		System.out.println("myNumber2의 값" + myNumber2.num);
		System.out.println("myNumber3의 값" + myNumber3.num);
		
		instMethod(myNumber3);
		System.out.println("myNumber1의 값" + myNumber1.num);
		System.out.println("myNumber2의 값" + myNumber2.num);
		System.out.println("myNumber3의 값" + myNumber3.num);
	}
	
	public static void instMethod(Number number) {
		number.addNum(7);
	}

}
*/
