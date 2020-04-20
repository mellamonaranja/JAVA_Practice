package com.ext4;

class Parent4{

	int a;
	public Parent4() {
		super();
//		every class is taken over object class implicitly
		System.out.println("Parent class");
	}
}

class Child4 extends Parent4{
	
	int b;
	public Child4() {
//	super();
//	if super is hidden here, object can be created normally
	}
}


public class SuperEx04 {

	public static void main(String[] args) {
		Child4 child4=new Child4();
		System.out.println(child4.a);
		System.out.println(child4.b);
		
		child4.a=10;
		child4.b=20;
		
		System.out.println(child4.a);
		System.out.println(child4.b);
	}

}
