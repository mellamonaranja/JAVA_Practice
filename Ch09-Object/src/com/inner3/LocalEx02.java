package com.inner3;

public class LocalEx02 {
	
	int a=100;
	
	public void innerTest() {
		int b=200;
//		local variable 
		class Inner{
			int c=300;
			final int NUM=400;
			
			public void getData() {
				System.out.println(a);
				System.out.println(c);
				System.out.println(NUM);
				System.out.println(b);
			}
		}//inner class finished
		
		Inner inner=new Inner();
		inner.getData();
//		1. the way to call method
		new Inner().getData();
//		2. the way to call method which is merged 1.
		
	}

	public static void main(String[] args) {
		LocalEx02 localex02=new LocalEx02();
		localex02.innerTest();

	}

}
