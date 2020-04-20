package com.list;

import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String>();
		
		arraylist.add("a");
		arraylist.add("b");
		arraylist.add("c");
		arraylist.add("d");
		
		for(String name:arraylist) {
//		can be put collection material into arraylist
//			do put arraylist into name
			System.out.println(name);
		}
		
		arraylist.remove(2);
//		remove 2nd index
		
		for(String name:arraylist) {
			System.out.println(name);
		}
		
		arraylist.remove("a");
//		remove correspond index
		
		for(String name:arraylist) {
			System.out.println(name);
		}
	}

}
