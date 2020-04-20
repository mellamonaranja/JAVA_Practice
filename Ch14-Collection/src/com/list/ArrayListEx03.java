package com.list;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		ArrayList arraylist=new ArrayList();
		arraylist.add("a");
		arraylist.add("b");
		arraylist.add("c");
		arraylist.add("d");
		
		arraylist.add(new Integer(2019));
//		integer type can be stored here in object place because when ArrayList has been created, it didn't declared generic type
		
		for(int i=0;i<arraylist.size();i++) {
			String name=(String)arraylist.get(i);
//			has been up-casting from undefined object to string type
			System.out.println(name);
//			it printed however integer cannot be cast to string
			
		}
	}

}
