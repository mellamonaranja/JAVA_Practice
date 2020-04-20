package com.Generics6;

interface Info{
	public int getInfo();
}

class EmployeeInfo implements Info{

	public int position;
	
	public EmployeeInfo(int position) {
		super();
		this.position = position;
	}

	@Override
	public int getInfo() {
		return this.position;
	}
	
}

class Person<T extends Info>{
//	restrict to T, only allows within Info(interface type)
//	getInfo method should be over-rided
	
	public T info;

	public Person(T info) {
		super();
		this.info = info;
		info.getInfo();		
	}
	
}

public class GenericsEx12 {

	public static void main(String[] args) {
//		Person<T extends Info> person1=new Person<T extends Info>();
//		child class made by Info interface only allow to declare T type
		Person<EmployeeInfo> person1=new Person<EmployeeInfo>(new EmployeeInfo(2019));
		System.out.println(person1.info.getInfo());
		
//		Person<EmployeeInfo> person2=new Person<String>(new EmployeeInfo("boss"));
//		string type cannot be allowed to T type
		
	}

}
