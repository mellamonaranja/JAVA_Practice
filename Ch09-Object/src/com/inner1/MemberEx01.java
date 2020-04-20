package com.inner1;

class Outer{
//	outside class
	int x=100;
//	member variable
	
	class Inner{
//		inner class
		int y=200;
//		the way to approach is through the object
	}
}

public class MemberEx01 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		System.out.println(outer.x);
		
		Outer.Inner inner=outer.new Inner();
//		object of outer's object
		System.out.println(inner.y);
		
	}

}
