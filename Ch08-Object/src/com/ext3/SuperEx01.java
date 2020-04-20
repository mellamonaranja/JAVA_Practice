package com.ext3;

class A{
	int a=100;
	
	public void play() {
		System.out.println("play method of parent class");
	}
}


class B extends A{
	int a=200;
//	parent a value is going to change to child's a value
	
//	super.a=100;
//	it's impossible to initialize of parent variable in child class
	public B() {
//		super(); is created automatically implicitly
		
		super.play();
//		call to parent object's play
		System.out.println(super.a);
		
	}
	
	@Override
	public void play() {
		System.out.println("play method of child class");
	}
	
	public void getParentPlay() {
		super.play();
		System.out.println(super.a);
	}
}
public class SuperEx01 {

	public static void main(String[] args) {
		B b=new B();
		b.play();
		b.getParentPlay();
		System.out.println(b.a);
		

	}

}
