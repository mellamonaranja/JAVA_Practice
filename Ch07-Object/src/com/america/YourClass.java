package com.america;

public class YourClass {

	public void accessClass(MyClass myClass) {
//		MyClass�� ���� �ڷ���, myClass���� MyClass�� ��ü�� �������� �����
		myClass.setNumber(12);
		System.out.println(myClass.getNumber());
	}
	
	public static void main(String[] args) {
	YourClass yourClass = new YourClass();
	
	MyClass myClass = new MyClass();
	yourClass.accessClass(myClass);
	
	
	
}
}