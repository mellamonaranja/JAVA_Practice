package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {
		String[]arr1= {"java", "jsp", "android", "java", "html5", "oracle", "jsp"};
		
		HashSet<String> hashset=new HashSet<String>();
		
		for(String string:arr1) {
			hashset.add(string);
		}
		System.out.println("hashset is "+hashset);
//		it removed duplicated data automatically, non line up printed
		
		Iterator<String> iterator=hashset.iterator();
//		call the circuit from hashset with iterator 
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		String[]arr2= {"java", "Go", "oracle", "JAVA", "phyton", "Xamarin", "JSP"};
		
		HashSet<String> hashset2=new HashSet<String>();
		
		for(String string:arr2) {
			hashset2.add(string);
		}
		System.out.println("hashset1 is "+hashset);
		System.out.println("hashset2 is "+hashset2);
		
		hashset.removeAll(hashset2);
//		remove duplicate value of hashset2 and put into hashset 
		
		System.out.println("hashset1 is "+hashset);
		System.out.println("hashset2 is "+hashset2);
		
	}

}
