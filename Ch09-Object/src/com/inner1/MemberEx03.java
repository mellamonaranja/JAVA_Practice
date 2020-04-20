package com.inner1;

class OuterClass{
	private String name;
	private int num;
	
	public OuterClass(String name) {
		this.name=name;
		num=0;
	}
	
	public void whatsYourName() {
		num++;
		System.out.println("outer "+ name + " outer "+num);
	}
	
	class InnerClass{
		public InnerClass() {
			whatsYourName();
//			inner class can approach outside class's constructor
		}
	}
}

public class MemberEx03 {

	public static void main(String[] args) {
		OuterClass outer1=new OuterClass("alice");
		OuterClass outer2=new OuterClass("steve");
		
		outer1.whatsYourName();
		outer2.whatsYourName();
		
		System.out.println();
		OuterClass.InnerClass inner1=outer1.new InnerClass();
		OuterClass.InnerClass inner2=outer2.new InnerClass();
		OuterClass.InnerClass inner3=outer1.new InnerClass();
		OuterClass.InnerClass inner4=outer2.new InnerClass();
		OuterClass.InnerClass inner5=outer2.new InnerClass();
		OuterClass.InnerClass inner6=outer2.new InnerClass();
	}

}
