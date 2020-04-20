package com.korea;

class Human{
	
	protected String name;
//	'protected' can be used in children only 
	protected int age;	
}

class Teacher extends Human{
//	children extends parents
	
	
	public void setAge(int num) {
		age=num;
	}
	
	public void getAge() {
		System.out.println(age);
		
	}
}

public class School {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setAge(27);
		
		teacher.getAge();

	}

}
