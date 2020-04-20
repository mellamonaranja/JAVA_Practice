package com.list;

import java.util.ArrayList;

public class ArrayListEx06 {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
//		generic type has been declared as an Integer type

		arraylist.add(new Integer(10));
		arraylist.add(20);
//		it has been auto boxing as Integer type
		arraylist.add(30);
		arraylist.add(40);
		
		for(Integer num:arraylist) {
//			do put the arraylist into integer type num
			System.out.println(num);
//			printed int type
//			in has been auto un-boxing from integer type to int type
			System.out.println(num.intValue());
		}
	}

}
