package com.ext1;

class Parent{
	int a = 100;
	
}

class Child extends Parent{

	int b=200;
	
}
//left heir, right inheritor
//heir has int a as well


public class Extend01 {

	public static void main(String[] args) {
		Child ch=new Child();
		System.out.println(ch.b);
		System.out.println(ch.a);

	}
	
//	every class takes over 'object class' implicitly

}
