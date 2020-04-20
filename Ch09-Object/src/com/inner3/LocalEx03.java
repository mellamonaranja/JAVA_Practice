package com.inner3;

public class LocalEx03 {
	
	int a=100;
	
	public void innerTest(int k) {
		final int b=200;
//		local variable including local inner class
//		in order to approach to local inner variable, need to put 'final'here
		final int C=k;
		
		class Inner{
			
			public void getData() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(C);
			}//finished getData
		}//finished inner class
		
		Inner inner=new Inner();
		inner.getData();
	}

	public static void main(String[] args) {
		LocalEx03 localex03=new LocalEx03();
		localex03.innerTest(300);

	}

}
