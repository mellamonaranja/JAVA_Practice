package com.america;

public class YourClass {

	public void accessClass(MyClass myClass) {
//		MyClass는 참조 자료형, myClass에는 MyClass의 객체의 참조값이 저장됨
		myClass.setNumber(12);
		System.out.println(myClass.getNumber());
	}
	
	public static void main(String[] args) {
	YourClass yourClass = new YourClass();
	
	MyClass myClass = new MyClass();
	yourClass.accessClass(myClass);
	
	
	
}
}