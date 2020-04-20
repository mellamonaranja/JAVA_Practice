package com.ext1;

class A{
	public void make() {
		System.out.println("parents class");
	}
}

class B extends A{
	public void fun() {
		System.out.println("child class");
	}
}

public class Extend02 {

	public static void main(String[] args) {
		B child = new B();
		child.fun();
		child.make();
		
		

	}

}
