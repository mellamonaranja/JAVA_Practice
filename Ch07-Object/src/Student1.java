
public class Student1 {

	String name;
	int age;
//	string은 class이기 때문에 null값으로 초기화됨
//	int는 age의 기본 값인 0으로 보여짐
	
	public static void main(String[] args) {
		
		Student1 Student1 = new Student1();
//		객체 생성함
		System.out.println(Student1);
		System.out.println(Student1.name);
		System.out.println(Student1.age);
		
		Student1.name = "홍길동";
		Student1.age = 400;
		
		System.out.println(Student1.name);
		System.out.println(Student1.age);
	}

}
