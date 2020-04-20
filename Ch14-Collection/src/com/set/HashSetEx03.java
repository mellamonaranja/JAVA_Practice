package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx03 {

	public static void main(String[] args) {
		Object[]obj= {"10", new Integer(10), "20", "20", "30", new Integer(30), "30", "40", "40", "40", "40"};
//		if there is duplicate value, array doesn't make new object, just refer the reference address
//		therefore 20 only printed out once
		
		Set set=new HashSet();
		
		for(int i=0;i<obj.length;i++) {
			set.add(obj[i]);
		}
		System.out.println(set);
	}

}
