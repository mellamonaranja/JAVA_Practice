package com.Generics1;

class StudentInfo{
	public int grade;
	
	StudentInfo(int grade){
		this.grade=grade;
//		create the constructor and initialized int at the same time
	}
}

class Person{
	
	public Object info;
	Person(Object info){
		this.info=info;
	}
//	from public StudentInfo info;
//	because object is on the top
	
}

class EmployeeInfo{
	public int position;
	EmployeeInfo(int position){
		this.position=position;
	}
	
}



public class GenericsEx05 {

	public static void main(String[] args) {
		Person person1=new Person(new EmployeeInfo(20));
		EmployeeInfo employeeinfo1=(EmployeeInfo)person1.info;
		System.out.println(employeeinfo1.position);
		
		Person person2=new Person("boss");
		EmployeeInfo employeeinfo2=(EmployeeInfo)person2.info;
		System.out.println(employeeinfo2.position);
		
		Person person3=new Person(new EmployeeInfo(10));
		StudentInfo studentinfo=(StudentInfo)person3.info;
		System.out.println(studentinfo.grade);
	}

}
