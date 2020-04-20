class People1{
	private String name;
	private int age;
	private int gender;
	private String job;
//	they are variable member in private 
	
	public void showInfo() {
		System.out.println(name + "\t" + age + "\t" + gender + "\t" + job);
	}
	
	public People1(String name, int age, int gender, String job) {
//	constructor	
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.job=job;
		
		showInfo();
		
	}

	public People1(String name, int age, String job) {
		this(name, age, 1, job);
	}
	
	public People1(String name, int age) {
		this(name, age, 1, null);
}

	public People1(int age) {
		this(null, age, 1, null);
	}
	
	public People1() {
		this(null, 0, 1, null);
	}
}
public class ThisEx04 {

	public static void main(String[] args) {
	People1 pp1 = new People1();
	People1 pp2 = new People1(27);
	People1 pp3 = new People1("Hiro", 27);
	People1 pp4 = new People1("Claire", 23, "Student");
	People1 pp5 = new People1("Niki", 32, 0, "Secretary");
	}

}
