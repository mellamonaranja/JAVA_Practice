package com.list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
//		arraylist is list structure based on array
		arraylist.add("a");
//		index 0
//		this string type has been up-casting from string to object implicitly
		arraylist.add("b");
//		index 1
		arraylist.add("c");
		arraylist.add("d");
		arraylist.add("e");
		
		for(int i=0;i<arraylist.size();i++) {
			String name=(String)arraylist.get(i);
//			has been down-casting from object type to string type
			System.out.println(name);
			
		}
	}

}
