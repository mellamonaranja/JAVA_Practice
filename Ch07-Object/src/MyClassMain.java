
public class MyClassMain {

	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		
		mc1.setName("이세영");
		mc1.setAge(22);

		System.out.println(mc1.getName() + mc1.getAge());
		
		MyClass mc2 = new MyClass("이세영 오빠");
		System.out.println(mc2.getName() + mc2.getAge());
		
		MyClass mc3 = new MyClass("이세영 동생", 18);
		System.out.println(mc3.getName() + mc3.getAge());
		

	}

}
