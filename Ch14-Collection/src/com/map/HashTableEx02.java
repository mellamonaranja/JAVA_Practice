package com.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx02 {

	public static void main(String[] args) {
		Hashtable<String, String> hashtable=new Hashtable<String, String>();
//		String is key, double is value	
		hashtable.put("name", "a");
		hashtable.put("age", "27");
		hashtable.put("phone", "123");
		hashtable.put("address", "b");
		
		System.out.println(hashtable);
		
		Enumeration<String> enumeration=hashtable.keys();
//		in order to make circuit data, it needs keys address
//		created Enumeration object, string type, circuit with hashtable with only key elements
		
		while(enumeration.hasMoreElements()) {
//			if there is more elements contain?(is there any key value?)
			String string=enumeration.nextElement();
//			if so, put into string 
			System.out.println(string+hashtable.get(string));
		}
		
	}

}
