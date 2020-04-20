package com.mathex;

public class MathEx04 {

	public static void main(String[] args) {
		
		String[]gift= {"iphone", "laptop", "camera", "tablet", "no"};
		
		double random = Math.random();
		System.out.println(random);
//		random calls between 0 and 1
		
		int i=(int)(random*5);
		System.out.println(i);
//		get the random result between 0 and 4
		System.out.println(gift[i]);

	}

}
