package com.Generics2;

class StudentInfo{
	public int grade;
	
	StudentInfo(int grade){
		this.grade=grade;
//		create the constructor and initialized int at the same time
	}
}

class EmployeeInfo{
	public int position;
	EmployeeInfo(int position){
		this.position = position;
	}
}

class Person<T>{
	
	public T info;
	Person(T info){
		this.info=info;
	}
	
}


public class GenericsEx06 {

	public static void main(String[] args) {
		Person<EmployeeInfo> person1=new Person<EmployeeInfo>(new EmployeeInfo(1));
		EmployeeInfo employeeinfo=person1.info;
		System.out.println(employeeinfo.position);
		
		Person<String> person2=new Person<String>("");
		String employeeinfo2=person2.info;
		
		Person<StudentInfo> person3=new Person<StudentInfo>(new StudentInfo(20));
		StudentInfo studentinfo=person3.info;
		System.out.println(studentinfo.grade);
		
		
		

	}

}
