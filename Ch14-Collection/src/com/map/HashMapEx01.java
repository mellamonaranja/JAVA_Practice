package com.map;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
		
		hashmap.put("a", new Integer(95));
		hashmap.put("b", new Integer(100));
		hashmap.put("c", new Integer(85));
		hashmap.put("d", new Integer(93));
		hashmap.put("e", new Integer(70));
		hashmap.put("f", new Integer(20));
		
		System.out.println(hashmap);
		
		Integer num=hashmap.get("e");
		System.out.println(num);
		
		hashmap.put("e", new Integer(0));
		num=hashmap.get("e");
		System.out.println(num);
//		if hashmap has same key value, it change
		
		System.out.println(hashmap);
//		e has been changed to 0
		
		hashmap.put("g", new Integer(40));
		System.out.println(hashmap);
		
		hashmap.put(null, new Integer(99));
		System.out.println(hashmap);
//		null works
		
		hashmap.put(null, 999);
		System.out.println(hashmap);
//		null works as key therefore null has been recognized one key value, doesn't create another null
		
		hashmap.put("f", null);
		System.out.println(hashmap);
		
		hashmap.put("g", null);
		System.out.println(hashmap);
//		value can be duplicated but key allows only one null 
	}

}
