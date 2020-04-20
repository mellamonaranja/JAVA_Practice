package com.ext2;

class Parent{
	public void make() {
		System.out.println("parent class");
		
	}
}

class Child extends Parent{
	@Override
//	going to override with make from parent
//	it is function help to check when override the declaration the method in child
//	ex)any typo make-->meke
	public void make() {
		System.out.println("child class");
//		has been overriding
//		once it override, it defined the last declaration and make from Parent is hided
	}
}


public class OverridingEx01 {

	public static void main(String[] args) {

		

	}

}
