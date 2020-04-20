package com.ext1;

public class Extend03 {

	public static void main(String[] args) {
		Employee man1=new Employee("Google", "Developer", "Kim");
		Employee man2=new Employee("Facebook", "Engineer", "Lee");
//		first, second are from child, third is from parent
		
		man1.showName();
		man1.showInfo();
		
		man2.showInfo();
	}

}

class Person{
	String name;
	
	public Person(String name) {
		this.name=name;
	}
	
	public void showName() {
		
		System.out.println("my name is" + name);
	}
		
	}

class Employee extends Person{
	
	String company;
	String position;
	
	public Employee(String company, String position, String name) {
//		String name from parents need to be added to index
		super(name);
//		parents is super
//		super should be placed primary to child
		this.company=company;
		this.position=position;
		
	}
	
	public void showInfo() {
		
		showName();
		System.out.println("company is " + company);
		System.out.println("position is " + position);
	}
	
	
	
	
	
	
}