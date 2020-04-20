package com.mathex;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		String[]luck=  {"로또 당첨", "오늘하루 휴일", "여유로운 하루", 
				"즐거운 만남", "그냥그냥", "음악이 있는 하루"};
		
		Random random=new Random();
//		in order to use random method, need to import from java.util.Random;
		
		int i= random.nextInt(6);
//		need the value from 0 to 5 in index
		System.out.println(i);
		
		System.out.println(luck[i]);
	}

}
