

class EmployeeInfo{
	public int position;
	
	public EmployeeInfo(int position) {
		this.position=position;
	}
}

class Person<T, S>{
//	declare two generic
	public T info;
	public S id;
//	the exact type of T, S will be created when create an object
	
	public Person(T info, S id) {
//		T and S is just unidentified type yet
		this.info=info;
		this.id=id;
	}
}

public class GenericsEx08 {

	public static void main(String[] args) {
//		Person<T, S> person1=new Person(new EmployeeInfo(10), 10);
		Person<EmployeeInfo, Integer> person1=new Person<EmployeeInfo, Integer>(new EmployeeInfo(10),10);
//		EmployeeInfo, Integer have been replaced from <T, S>
//		<T, S> only allow Integer
		
		Person<EmployeeInfo, Integer> person2=new Person<EmployeeInfo, Integer>(new EmployeeInfo(20), new Integer(20));
//				put the factor into the ()
		
		System.out.println(person2.info.position);
		System.out.println(person2.id);
		System.out.println(person2.id.intValue());
		
		

	}

}
