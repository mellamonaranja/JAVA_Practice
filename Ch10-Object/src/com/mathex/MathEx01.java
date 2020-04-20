package com.mathex;

public class MathEx01 {

	public static void main(String[] args) {
		int i=Math.abs(-10);
//		absolute price method is Math.abs
		System.out.println(i);

		double d=Math.ceil(3.3);
//		ceiling value method is Math.ceil
		System.out.println(d);
		
		d=Math.floor(3.7);
		System.out.println(d);
//		down value methos is Math.floor
		
		d=Math.round(4.5);
		System.out.println(d);
//		if decimal point is less than 0.4, it return integer number without decimal point but 
//		if decimal point is more than 0.5, it return integer number after round
		
		i=Math.max(1, 2);
		System.out.println(i);
		
		i=Math.min(1, 2);
		System.out.println(i);
	}
	

}
