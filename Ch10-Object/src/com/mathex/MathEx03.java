package com.mathex;

public class MathEx03 {

	public static void main(String[] args) {

		double a=100.123456;
		double d=Math.round(a);
		System.out.println(d);
		
		double b=Math.round(a*100d)/100d;
//		the method to get the result decimal 2point 
		System.out.println(b);
	}

}
