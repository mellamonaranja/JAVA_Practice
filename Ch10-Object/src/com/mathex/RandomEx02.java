package com.mathex;

import java.util.Random;

public class RandomEx02 {

	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			Random random=new Random();
			System.out.println(i);
			
			int j= random.nextInt(2000);
			System.out.println(j);
			
		}

	}

}
