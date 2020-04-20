package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx09 {

	public static void main(String[] args) {

		final int LIMIT=10;
//		wanna cut the string with every 10
		String source="0123456789abcdefghijABCDEFGHIJ!@#$%&*();7890ZZZ";
		int length=source.length();
		
		new ArrayList(length/LIMIT+10);
//		made a space 10 and extra 10 just in case
		
		List list=new ArrayList(length/LIMIT+10);
		
		for(int i=0;i<length;i+=LIMIT) {
			if(i+LIMIT<length) {
				list.add(source.substring(i, i+LIMIT));
//				??
//				it extract within limit range from i to i+LIMIT(10) every 10 while less than length
//				and put the result into list
//				remove the the index from beginIndex to endIndex
			}else {
				list.add(source.substring(i));
//				it extract from i to the end(endless) while less than length
			}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
