package com.mathex;

import java.util.Arrays;

public class RandomEx06 {

	public static void main(String[] args) {
		
		int[]random=new int[6];
		for(int i=0;i<random.length;i++) {
			int n=(int)(Math.random()*44)+1;
			for(int j=0;j<i;j++) {
				if(random[j]==n) {
					n=(int)(Math.random()*44)+1;
					j=-1;
				}
			}
			random[i]=n;
		}
		Arrays.sort(random);
		System.out.println("Your Lottery number is "+Arrays.toString(random));	
	}

}


