package com.Generics5;

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
	
	public <U> void printData(U info){
//		in order to use U function, need to declare <U> here
//		<U>type is declare when call to printData
//		contrast to T info, S id
//		they are declared when they create
		System.out.println(info);
	}
	
	
}


public class GenericsEx11 {

	public static void main(String[] args) {
		EmployeeInfo employeeinfo=new EmployeeInfo(100);
		Integer integer=new Integer(200);
		
//		1. Person<T, S> person1=new Person<T, S>();
//		2. Person<EmployeeInfo, Integer> person1=new Person<EmployeeInfo, Integer>();
//		3. is EmployeeInfo employeeinfo=new EmployeeInfo(100);, Integer integer=new Integer(200);
//		4. Person<EmployeeInfo, Integer> person1=new Person<EmployeeInfo, Integer>(employeeinfo, integer);
		
		Person<EmployeeInfo, Integer> person1=new Person<EmployeeInfo, Integer>(employeeinfo, integer);
		
		person1.<Integer>printData(integer);
		person1.printData(employeeinfo);
		person1.printData(integer);
//		implicitly when put the integer, when call the printData, it change the integer type automatically
	}

}
