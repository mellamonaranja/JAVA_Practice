package com.inner1;

class Outer2{
	int x=100;
//	member variable
	class Inner2{
//		member inner class
		int y=200;
		
		public void getData() {
			System.out.println(y);
			System.out.println(x);
//			x is belong to outer class, inner can approach to outer data because inner is belong to outer
		}
	}
	
}

public class MemberEx02 {

	public static void main(String[] args) {
		Outer2 outer2=new Outer2();
		Outer2.Inner2 inner2=outer2.new Inner2();
		
		Outer2.Inner2 inner3=new Outer2().new Inner2();
//		same way how to create inner object
		
		inner2.getData();
		inner3.getData();
		
		System.out.println(new Outer2());
//		printed reference value of new Outer2()
		System.out.println(new Outer2().x);
		System.out.println(outer2.x);
//		new Outer2().x and outer2.x are same
		
//		System.out.println(outer2.y);
//		cannot approach to y from outer class
	}

}
