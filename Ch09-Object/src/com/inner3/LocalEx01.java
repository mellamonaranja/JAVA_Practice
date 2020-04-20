package com.inner3;

public class LocalEx01 {

	public void innerTest() {
				
		class Inner{
//			the class inside the method, can created limit-less
			public void getData() {
				System.out.println("local inner class");
			}
			
		}
		Inner inner=new Inner();
		inner.getData();
		
	}
	
	public static void main(String[] args) {
		LocalEx01 localex01=new LocalEx01();
		localex01.innerTest();
//		in order to call the method of inner class, need to call public name(localex01.innerTest)

	}

}
