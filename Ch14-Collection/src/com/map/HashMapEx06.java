package com.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx06 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
		hashmap.put("thirty", 30);
		hashmap.put("ten", 10);
		hashmap.put("forty", 40);
		hashmap.put("twenty", 20);
		
		System.out.println(hashmap.keySet());
//		return the only key of hashmap
//		hashmap.keySet() is the collection
		
		for(String key:hashmap.keySet()) {
//			input the collection(hashmap.keySet()) into string type key
			System.out.println(key+":"+hashmap.get(key));
		}
		hashmap.remove("forty");
		
		Iterator<String> keyiterator=hashmap.keySet().iterator();
//		get only key information with set type and made circuit with iterator
		
		while(keyiterator.hasNext()) {
			String key=keyiterator.next();
			System.out.println(key+hashmap.get(key));
		}
		hashmap.replace("twenty", 200);
//		do replace twenty to 200 if it has twenty
//		otherwise it doesn't replace neither create
		for(String key:hashmap.keySet()) {
			System.out.println(key+":"+hashmap.get(key));
		}
		System.out.println();
		System.out.println(hashmap.size());
		
	}
}
