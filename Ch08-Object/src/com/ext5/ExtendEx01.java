package com.ext5;

class Parent{
	
	int a=100;
}

class Child extends Parent{
	
	int b=200;
}


public class ExtendEx01 {

	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.a);
		System.out.println(child.b);

		Parent parent = child;
//		child material type has been changed to parent material type
		
		System.out.println(parent.a);
//		System.out.println(parent.b);
//		b cannot print because b is belong to child
//		b is get out of call range
		
		Child child2=(Child)parent;
//		change from parent range to child range
//		when parent to call to child, need to be specified with (Child)
		System.out.println(child2.a);
		System.out.println(child2.b);
		
	}

}
