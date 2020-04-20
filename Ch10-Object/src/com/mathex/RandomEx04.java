package com.mathex;

import java.util.Random;

public class RandomEx04 {

	public static void main(String[] args) {
		Random generator=new Random();
		
		int num;
		num=generator.nextInt();
//		it extracts within int range randomly
		System.out.println(num);
		
		num=generator.nextInt(10);
//		it extracts from 0 to 9
		System.out.println("from 0 to 9 "+num);

		num=generator.nextInt(10)+1;
		System.out.println("from 0 to 10 "+num);
		
		num=generator.nextInt(15)+1;
		System.out.println("from 0 to 16 "+num);

		num=generator.nextInt(6)+20;
		System.out.println("from 20 to 25 "+num);
//		the count from 20 to 25 is 6
		
		num=generator.nextInt(15)+20;
		System.out.println("from 20 to 34 "+num);
		
		num=generator.nextInt(30)+(-10);
		System.out.println("from -10 to 19 "+num);
		
		float num2=generator.nextFloat();
//		it extracts within float range(from 0 to 1) randomly
		System.out.println(num2);
		
		num2=generator.nextFloat()*6;
		System.out.println(num2);
//		it gets result from 0 to 5
		
		num=(int)num2;
		System.out.println(num);
		
		num=(int)num2+1;
		System.out.println(num);
//		it gets result from 1 to 6
	}

}
