package com.Generics4;

class EmployeeInfo{
	public int position;
	
	public EmployeeInfo(int position) {
		this.position=position;
	}
}

class Person<T, S>{
	public T info;
	public S id;
	
	public Person(T info, S id) {
		super();
		this.info = info;
		this.id = id;
	}


	
}



public class GenericsEx10 {

	public static void main(String[] args) {
		EmployeeInfo employeeinfo = new EmployeeInfo(10);
		Integer integer = new Integer(20);
		
//		Person<T, S> person=new Person<T, S>();
//		Person<T, S> person=new Person<EmployeeInfo, Integer>();
//		need to create object of both of EmployeeInfo, Integer before
		
		Person<EmployeeInfo, Integer> person1=new Person<EmployeeInfo, Integer>(employeeinfo, integer);
		Person<EmployeeInfo, Integer> person2=new Person(employeeinfo, integer);
//		<EmployeeInfo, Integer> can be omitted 
		
		System.out.println(person2.info.position);
		System.out.println(person2.id.intValue());
		
//		Person person3=new Person(employeeinfo, integer);
//		in conditional part, <EmployeeInfo, Integer> cannot be omitted(cannot be printed as below)
//		System.out.println(person3.info.position);
//		System.out.println(person3.id.intValue());
		
		
		
	}

}
