package com.inner4;

class InnerParent1{
	public void display() {
		System.out.println("display of parent class");
	}
}

public class AnomymousEx01 {

	public void innerTest() {
		
		class Inner extends InnerParent1{
//			class who has name, Inner
			@Override
			public void display() {
				System.out.println("re-declared display");
			}
		}
		Inner inner=new Inner();
//		constructor function
		inner.display();
	}
	
	public static void main(String[] args) {
		
		AnomymousEx01 anomymousex01=new AnomymousEx01();
		anomymousex01.innerTest();

	}

}
