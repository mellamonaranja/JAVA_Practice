package com.inner2;

public class StaticEx01 {
	
	public static class StaticInner{
//		without static, cannot create static int variable
		int iv=200;
		static int sv=300;
//		declared inner static variable inside of public class StaticEx01 
//		in order to put 'static', need to put 'static' to public static class StaticInner{ as well
		
	}

	public static void main(String[] args) {
		
		StaticEx01.StaticInner staticinner1=new StaticInner();
//		create object with non-static way
		System.out.println(staticinner1.iv);
		System.out.println(staticinner1.sv);
		
		StaticEx01.StaticInner staticinner2=new StaticEx01.StaticInner();
//		the name of StaticInner has been changed to StaticEx01.StaticInner in order to create an object(new StaticEx01.StaticInner)
		System.out.println(staticinner2.iv);
		System.out.println(staticinner2.sv);
		
		System.out.println(StaticEx01.StaticInner.sv);
//		the way to approach static type (without create object) recommendable

	}

}
