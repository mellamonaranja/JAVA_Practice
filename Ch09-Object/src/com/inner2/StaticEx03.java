package com.inner2;

class OuterClassOne{
	
	public OuterClassOne() {
		NestedClass nestedclass = new NestedClass();
		nestedclass.simpleMethod();
	}
	
	static class NestedClass{
//		can create an object without create separated object
		public void simpleMethod() {
			System.out.println("Nested instance method one");
		}
	}
}

class OuterClassTwo{
	public OuterClassTwo() {
		NestedClass nestedclass = new NestedClass();
		nestedclass.simpleMethod();
	}
	
	private static class NestedClass{
//		it has declared private, only allows to approach within this class
		public void simpleMethod() {
			System.out.println("Nested instance method two");
		}
	}
}
public class StaticEx03 {

	public static void main(String[] args) {
		OuterClassOne outerclassone = new OuterClassOne();
		OuterClassTwo outerclasstwo = new OuterClassTwo();
		
		OuterClassOne.NestedClass nestedclass1=new OuterClassOne.NestedClass();
		nestedclass1.simpleMethod();
		
//		OuterClassTwo.NestedClass nestedclass2=new OuterClassTwo.NestedClass();
//		cannot create with private static class
	}

}
