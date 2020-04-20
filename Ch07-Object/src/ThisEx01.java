
public class ThisEx01 {
	
	public ThisEx01() {
//		constructor
		System.out.println("before create an object is " + this);
	}

	public static void main(String[] args) {
		
		ThisEx01 te = new ThisEx01();
		
		System.out.println("after create an objec is " + te);

	}

}
