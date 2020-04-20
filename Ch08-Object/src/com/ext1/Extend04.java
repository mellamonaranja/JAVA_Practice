package com.ext1;

class Bird{
	int num1;
//	default
	protected int num2;
	
	public void fly() {
		System.out.println("parents class");
		System.out.println(num1);
		System.out.println(num2);
	}
}

class Eagle extends Bird{
	public Eagle() {
		
		num1=10;
		num2=20;
	}
	
	public void eat() {
//		void is non returnable
		System.out.println("child class");
		System.out.println(num1);
		System.out.println(num2);
	}
	
}

public class Extend04 {

	public static void main(String[] args) {
		Eagle eagle=new Eagle();
		eagle.eat();
		eagle.fly();
		
		
	}

}
