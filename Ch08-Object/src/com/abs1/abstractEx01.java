package com.abs1;

abstract class A{
	int a=100;
	
	public void setA(int a) {
		this.a=a;
	}
	
	public abstract void number();
//	abstract method who doesn't have the body
//	therefore class A is uncompleted class 
//	because A has uncompleted abstract method(at least more than 1)
//	therefore need to put abstract before class A
//	this uncompleted class's main purpose is just inheritance
//	cannot make object
}

class B extends A{
//	cannot make object, therefore create inheritance
//	when make inheritance, create override from abstract class is necessarily
//	afterward, abstract can be operated such as parent class
	int b=200;
	
	@Override
	public void number() {
		
		System.out.println("number method");
		
	}
	
}

public class abstractEx01 {

	public static void main(String[] args) {

		B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);
		
		b.number();
		b.setA(500);
		System.out.println(b.a);
		
	}

}
