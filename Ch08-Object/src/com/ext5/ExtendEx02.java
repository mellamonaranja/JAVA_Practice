package com.ext5;

class A{
	public void playA() {
		
		System.out.println("class a");
	}	
}

class B extends A{
	
	public void playB() {
		System.out.println("class b");
	}
}

public class ExtendEx02 {

	public static void main(String[] args) {
		B b=new B();
		
		b.playA();
		b.playB();
		
		A a=(B)b;
//		up-casting from child to parent
		
		a.playA();
//		a.playB();
//		a has been changed to parent therefore a.playB() cannot be called
		
		B b2=(B)a;
//		a has been changed to b, child 
		
		b2.playA();
		b2.playB();

	}

}
