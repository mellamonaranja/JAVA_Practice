package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx05 {

	static HashMap phoneBook=new HashMap();
	
	public static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
//			put the key, value into phoneBook
//			key, value which allows only object, therefore put new HashMap() object
			
		}
	}
	
	public static void addMember(String groupName, String name, String tel) {
		addGroup(groupName);
		
//		HashMap group=phoneBook.get(groupName);
//		this type is object
		HashMap group=(HashMap)phoneBook.get(groupName);
//		downcasting from object to HashMap type
		
		group.put(tel, name);
	}
	
	public static void addMember(String name, String tel) {
		addMember("other", name, tel);
	}
	
	public static void printList() {
		Set set=phoneBook.entrySet();
//		entryset has groupName, new HashMap()
//		set returned
//		entry object is belong to Set

		
		Iterator iterator=set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry entry=(Map.Entry)iterator.next();
			
			Set subSet=((HashMap)entry.getValue()).entrySet();
//			get the value of HashMap, and declare with HashMap type
//			whole thing is HashMap object
			
			Iterator subiterator=subSet.iterator();
			
			System.out.println("* "+entry.getKey()+subSet.size());
			while(subiterator.hasNext()) {
				Map.Entry subE=(Map.Entry)subiterator.next();
//				downcasting from object type to Map.Entry type
				String telNo=(String)subE.getKey();
				String name=(String)subE.getValue();
				
				System.out.println(telNo+name);
			}
			System.out.println();
		}//while finished
	}//printList finished
	
	public static void main(String[] args) {
		addMember("friend", "a", "111");
		addMember("friend", "b", "222");
		addMember("friend", "c", "333");
		addMember("company", "d", "444");
		addMember("company", "e", "555");
		addMember("company", "f", "666");
		addMember("company", "g", "777");
		
		addMember("cafeteria", "888");
		
		printList();
	}

}

// entry set=groupName, new HashMap()
// subset=groupName, groupName, new HashMap()
