package com.Generics3;

class EmployeeInfo{
	public int position;
	
	public EmployeeInfo(int position) {
		this.position = position;
	}
}

class Person<T, S>{
	public T info;
	public S id;
	
	public Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	
}



public class GenericsEx08 {

	public static void main(String[] args) {
		Person<EmployeeInfo, Integer> p1 = 
				new Person<EmployeeInfo, Integer>(
						new EmployeeInfo(10), 10
				);
		
		
		System.out.println("position: " + p1.info.position);
		System.out.println("id: " + p1.id);
		
		
		Person<EmployeeInfo, Integer> p2 =
				new Person<EmployeeInfo, Integer>(
						new EmployeeInfo(20), 
						new Integer(20)
						);
		
		System.out.println("position: " + p2.info.position);
		System.out.println("id: " + p2.id);
		System.out.println("id: " + p2.id.intValue());
		
	}

}
