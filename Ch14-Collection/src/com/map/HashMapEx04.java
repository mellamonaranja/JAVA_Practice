package com.map;

import java.util.Collection;
// Collection is belong to interface
import java.util.Collections;
// Collections is belong to class
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx04 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
		
		hashmap.put("a", new Integer(90));
		hashmap.put("b", new Integer(100));
		hashmap.put("c", new Integer(95));
		hashmap.put("d", new Integer(75));
		
		System.out.println(hashmap);
		
		Set<Map.Entry<String, Integer>> set=hashmap.entrySet();
//		return a set contained in hashmap
//		Entry object is consisted with key and value
//		because a pair of key and value put into Entry
//		Set has key and value
		
		Iterator<Map.Entry<String, Integer>> iterator=set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry=iterator.next();
//			it gets Entry object
			
			System.out.println("name is "+entry.getKey()+", score is " + entry.getValue());
		}
		
		Set<String> set2=hashmap.keySet();
		System.out.println("name is "+ set2);
		
		Collection<Integer> values=hashmap.values();
//		returns the collection of values contained in hashmap
		System.out.println(values);
		
		Iterator<Integer> iterator2=values.iterator();
//		circuit the values
		int total=0;
		
		while(iterator2.hasNext()) {
			Integer i=iterator2.next();
			total+=i.intValue();
//			get the value with int type
		}

		System.out.println("total score is "+total);
		System.out.println("average score is "+(float)total/set.size());
		
		System.out.println("the maximum score is "+Collections.max(values));
		System.out.println("the minimum score is "+Collections.min(values));
		
	}

}
