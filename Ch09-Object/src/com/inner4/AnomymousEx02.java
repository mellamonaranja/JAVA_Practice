package com.inner4;

class InnerParent2{
	public void display() {
		System.out.println("display of parent class");
	}
}

public class AnomymousEx02 {
	
	public void innerTest(){
		InnerParent2 innerparent2=new InnerParent2() {
//			create new object borrowed by parent's name
//			this class doesn't have name
			@Override
			public void display() {
				System.out.println("display of anomymous inner class");
			}
		};
//		at the same time to create the object and class structure
		
		innerparent2.display();
	}

	public static void main(String[] args) {
		AnomymousEx02 anomymous02=new AnomymousEx02();
		anomymous02.innerTest();

	}

}
