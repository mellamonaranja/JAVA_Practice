
public class ThisEx03 {
	
	public ThisEx03() {
		this("constructor without signature");
//		default constructor
		System.out.println("call the string after call the constructor");
	}

	public ThisEx03(String msg) {
		System.out.println(msg);
	}
//	constructor, same name as class
	
	public ThisEx03(int a) {
		this(String.valueOf(a));
//		call another constructor with this(), must be the first statement
		String str = String.valueOf(a);
		
	}
	
	public static void main(String[] args) {
		ThisEx03 te1=new ThisEx03();
		
		ThisEx03 te2=new ThisEx03("Korea");
		
		ThisEx03 te3=new ThisEx03(2019);
// 2019 is considered as int
//		int has been changed to string type with <<this(String.valueOf(a));>>
//		at last 2019 is string type after changed
	}

}
