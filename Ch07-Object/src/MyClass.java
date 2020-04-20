
public class MyClass {

	private String name;
	private int age;
	
	public MyClass() {
		
	}
	
	public MyClass(String n) {
		name = n;
	}
	
	public MyClass(String n, int a) {
		name = n;
		age = a;
		System.out.println("객체가 생성되었습니다.");
	}
	
	public void setName(String n) {
		name=n;
//		관례 상 set+ 첫 대문자, setter method
	}
	
	public String getName() {
//		getter method
		return name;
	}
	
	public void setAge(int a) {
		age=a;
	}
	
	public int getAge() {
		return age;
	}
		
}
