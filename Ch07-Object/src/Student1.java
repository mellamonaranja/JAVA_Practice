
public class Student1 {

	String name;
	int age;
//	string�� class�̱� ������ null������ �ʱ�ȭ��
//	int�� age�� �⺻ ���� 0���� ������
	
	public static void main(String[] args) {
		
		Student1 Student1 = new Student1();
//		��ü ������
		System.out.println(Student1);
		System.out.println(Student1.name);
		System.out.println(Student1.age);
		
		Student1.name = "ȫ�浿";
		Student1.age = 400;
		
		System.out.println(Student1.name);
		System.out.println(Student1.age);
	}

}
