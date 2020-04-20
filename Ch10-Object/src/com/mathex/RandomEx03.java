package com.mathex;

import java.util.Random;

public class RandomEx03 {

	public static void main(String[] args) {
		Random random=new Random(12);
//		in order to use random method, need to import from java.util.Random;
//		if put the value into (), when operate the random, it doesn't change (12)
		
		System.out.println(System.currentTimeMillis());
		
		random.setSeed(System.currentTimeMillis());
//		whenever operate the random function, get different result everytime with <<setSeed(System.currentTimeMillis());>>
		
		for(int i=0;i<10;i++) {
//			call the number only the number of less than 10
			System.out.println(random.nextInt(100));
//			the range is from 0 to 100
			
			
		}

	}

}
