class Person{
	
	String personName;
	int personID;
	int personAge;
	
	public Person(String name, int ID, int Age) {
//		������ �Լ�, Ŭ������� �����ϸ鼭 ��ȯŸ���� ����
		personName=name;
		personID=ID;
		personAge=Age;
		
	}
	
	public Person(String name, int Age) {
		personName=name;
		personID=0;
		personAge=Age;
	}
	
	public void showInfo() {
		System.out.println(personName + "�� �ȳ��ϼ���!!!");
		
		if (personID!=0) {
			System.out.println("����� ID" + personID);
			System.out.println("�����ϼ���");
		}else {
			System.out.println("����� ���̴�" + personAge);
			System.out.println("�̼������Դϴ�.");
			
		}
	}
}
public class OverloadingEx05 {

	public static void main(String[] args) {
		
		Person man = new Person("�ڹμ�", 981012, 27);
		Person idol = new Person("������", 18);

		man.showInfo();
		idol.showInfo();
	}

}
