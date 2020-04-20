package com.list;

import java.util.ArrayList;

public class ArrayListEx07 {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(15);
		arraylist.add(16);
		
		System.out.println(arraylist);
		
		for(int num:arraylist) {
//			auto unboxing from arraylist Integer type to int type
			System.out.println(num);
		}
		
//		for(int i=0;i<arraylist.size();i++) {
//			System.out.println(arraylist.get(i));
//			
//			if(arraylist.get(i)%2==0) {
//				arraylist.remove(i);
//			}
//		}
//		cannot extract an odd number
		
		for(int i=arraylist.size()-1;i>=0;i--) {
			if(arraylist.get(i)%2==0) {
				arraylist.remove(i);
			}
		}
//		for inverse in order to extract an odd number
		
		System.out.println(arraylist);
	}

}
