package com.inner4;

abstract class TestAbst{
	int data=1234567;
	
	public abstract void printData();
	
}

public class AnomymousEx03 {
	TestAbst testabst=new TestAbst() {
//	inherited parent(TestAbst) and create an object at the same time, make the structure of class
		@Override
		public void printData() {
			System.out.println(data);	
		}
		
	};

	public static void main(String[] args) {
		AnomymousEx03 anomymousex03=new AnomymousEx03();
		anomymousex03.testabst.printData();
	}

}
