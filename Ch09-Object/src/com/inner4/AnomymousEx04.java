package com.inner4;

class InnerParent4{
	public void display() {
		System.out.println("display of parent class");
	}
}

public class AnomymousEx04 {
	public void innerTest() {
//		InnerParent4 innerparent4=new InnerParent4() {
			new InnerParent4() {
			@Override
			public void display() {
				System.out.println("abbrevated anonymous inner class");
			}
		}.display();
		
//		innerparent4.display();
// 		innerparent4 is same as new InnerParent4() blah blah
//		therefore make it as a abbreviation
//		
		
	}

	public static void main(String[] args) {
		AnomymousEx04 anomymousex04=new AnomymousEx04();
		anomymousex04.innerTest();

	}

}
