package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		String[]city= {"seoul", "NY", "London", "Paris", "Berlin", "Tokyo", "Hanoi"};
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		for(int i=0;i<city.length;i++) {
			hashmap.put(i, city[i]);
		}
		System.out.println(hashmap);
		
		Set<Integer> set=hashmap.keySet();
//		return the set of the the keys contains in hashmap
//		return only integer type in set
		
//		Iterator<Integer> iterator=set.iterator();
//		put key set consisted with Integer into iterator 
//		this is the way 1.
		
		Iterator<Integer> iterator=hashmap.keySet().iterator();
//		this is the way 2.
//		because set=hashmap.keySet();
		
		while(iterator.hasNext()) {
			Integer key=iterator.next();
//			if there is key set, put into integer type key
			System.out.println(key+hashmap.get(key));
		}
		
	}

}
