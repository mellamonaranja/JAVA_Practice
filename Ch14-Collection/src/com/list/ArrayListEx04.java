package com.list;

import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String> ();
//		declared only string type can be put to generic arraylist type
		arraylist.add("a");
		arraylist.add("b");
		arraylist.add("c");
		arraylist.add("d");
		
//		arraylist.add(new Integer(200));
//		only allows String type, therefore integer type cannot be accessed
		
		for(int i=0;i<arraylist.size();i++) {
			String name=arraylist.get(i);
			System.out.println(name);
//			it hasn't been declared string type here but it can be printed
//			because ahead we already declared the String type as a genetic type
//			therefore here, without convert the form, can be printed as a string type
		}
		
	}

}
