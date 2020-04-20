package com.map;

import java.util.Hashtable;

public class HashTableEx01 {

	public static void main(String[] args) {
		Hashtable<String, Double> hashtable=new Hashtable();
//		String is key, double is value
		hashtable.put("a", new Double(173.2));
//		add function is put
		hashtable.put("b", 181.8);
		hashtable.put("c", new Double(192));
		hashtable.put("d", new Double(165.9));
		
		System.out.println(hashtable);
//		it showed in {} not [], means hashtable is consisted with array
		
		Double key=hashtable.get("a");
//		get function is get
		System.out.println(key);
		
		key=hashtable.get("a");
		System.out.println(key);
		System.out.println(hashtable);
		
		hashtable.put("e", new Double(333));
		System.out.println(hashtable);
		
//		hashtable.put(null, new Double(222));
//		System.out.println(hashtable);
		
//		hashtable.put("f", null);
//		System.out.println(hashtable);
//		cannot store null
		
		
	}

}
