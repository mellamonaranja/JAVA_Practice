package com.ext3;


class Parent2{
	
	int num=10;
}

class Child2 extends Parent2{
	public void display() {
		System.out.println(num);
//		inherited num
		System.out.println(this.num);
//		object's num
		System.out.println(super.num);
//		parent object's num
	}
	
}


public class SuperEx02 {

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.display();

	}

}
