
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
		System.out.println("��ü�� �����Ǿ����ϴ�.");
	}
	
	public void setName(String n) {
		name=n;
//		���� �� set+ ù �빮��, setter method
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
