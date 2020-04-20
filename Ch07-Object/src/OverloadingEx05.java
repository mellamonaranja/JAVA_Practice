class Person{
	
	String personName;
	int personID;
	int personAge;
	
	public Person(String name, int ID, int Age) {
//		생성자 함수, 클래스명과 동일하면서 반환타입이 없음
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
		System.out.println(personName + "님 안녕하세요!!!");
		
		if (personID!=0) {
			System.out.println("당신의 ID" + personID);
			System.out.println("입장하세요");
		}else {
			System.out.println("당신의 나이는" + personAge);
			System.out.println("미성년자입니다.");
			
		}
	}
}
public class OverloadingEx05 {

	public static void main(String[] args) {
		
		Person man = new Person("박민서", 981012, 27);
		Person idol = new Person("임주혜", 18);

		man.showInfo();
		idol.showInfo();
	}

}
