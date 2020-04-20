package com.ext5;

class ClassA{
	
}

class ClassB extends ClassA{
	
}

public class InstanceEx01 {

	public static void main(String[] args) {
		ClassA classa = new ClassA();
		ClassB classb = new ClassB();
		
		System.out.println(classa instanceof ClassA);
//		check if classa is made by ClassA or not
//		let's think about easy way that are parent is from child or no
		System.out.println(classb instanceof ClassA);
		System.out.println(classa instanceof ClassB);
		System.out.println(classa instanceof ClassB);

	}

}
