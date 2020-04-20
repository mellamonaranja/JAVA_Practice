package com.inner2;

class OuterClass{
	public OuterClass() {
		NestedClass nestedclass=new NestedClass();
		nestedclass.getData();
	}
	
	static class NestedClass{
//		once put static, without create an object, can approach the method with class
		public void getData() {
			System.out.println("nested instance method");
		}
	}
}

public class StaticEx02 {

	public static void main(String[] args) {
		OuterClass outerclass=new OuterClass();
		OuterClass.NestedClass nestedclass1=new OuterClass.NestedClass();
//		created inner class object
		
		nestedclass1.getData();
		
		
	}

}
