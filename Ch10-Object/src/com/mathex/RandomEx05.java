package com.mathex;

import java.util.Arrays;

public class RandomEx05 {

	public static void main(String[] args) {
	
		int[]random=new int[20];
		
		for(int i=0;i<random.length;i++) {
			int n=(int)(Math.random()*98)+1;
//			it gets result from 1 to 99
			
			random[i]=n;
		}
		System.out.println("random value before sort "+Arrays.toString(random));
		Arrays.sort(random);
		System.out.println("random value after sort "+Arrays.toString(random));
	}

}
