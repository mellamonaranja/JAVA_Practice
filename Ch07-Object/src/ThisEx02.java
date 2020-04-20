
public class ThisEx02 {
	
	String name;
	int age;
//	member variable

	public ThisEx02(String name, int age) {
//		매개 변수
		this.name=name;
		this.age=age;
//		initialized
	}
	
	public static void main(String[] args) {
		ThisEx02 te = new ThisEx02("codedragon", 27);
		System.out.println(te.name + te.age);

	}

}
