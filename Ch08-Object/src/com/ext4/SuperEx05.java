package com.ext4;

class A{
	int a =100;
	
	public A(String msg) {
		System.out.println(msg);
	}
}

class B extends A{
	public B() {
		super("Constructor who has signature");

	}

}

public class SuperEx05 {

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a);

	}

}
