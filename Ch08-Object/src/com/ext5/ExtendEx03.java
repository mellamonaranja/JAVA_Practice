package com.ext5;

class Parent3{
	
	int a=100;
	public void play() {
		System.out.println("parent class");
	}
}

class Child3 extends Parent3{
	
	int a=200;
	@Override
	public void play() {
		System.out.println("child class");
	}
}

public class ExtendEx03 {

	public static void main(String[] args) {
		Child3 child3=new Child3();
		System.out.println(child3.a);
		child3.play();
		
		Parent3 parent3=child3;
//		up-casting, child3 has been to change to parent range
		
		System.out.println(parent3.a);
		parent3.play();
//		because of the overriding, it appears child's play method
//		parent's play method has hided
		
	}

}
