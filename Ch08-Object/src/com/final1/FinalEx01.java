package com.final1;

public class FinalEx01 {

	int var1=100;
	
	final int VAR2=300;
	
	public static final int VAR3=400;
	
	public static void main(String[] args) {
		FinalEx01 final01 = new FinalEx01();
		System.out.println(final01.var1);
		
		final01.var1=200;
		System.out.println(final01.var1);
		
		System.out.println(final01.VAR2);
		
//		final01.VAR2=3000;
//		impossible to assigned final variable
		
		System.out.println(final01.VAR3);
//		as static is share concept so it's better to call classname.constant as below
		System.out.println(FinalEx01.VAR3);
		System.out.println(VAR3);
		
	}

}
