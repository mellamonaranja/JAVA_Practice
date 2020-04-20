package com.list;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList(2000000);
		LinkedList linkedlist=new LinkedList();
		
		System.out.println("data added in order");
		System.out.println("ArrayList"+ add_order(arraylist));
		System.out.println(add_order(linkedlist));
		
		System.out.println("data added in the middle");
		System.out.println("ArrayList "+ add_middle(arraylist));
		System.out.println("LinkedList "+add_middle(linkedlist));
		
		System.out.println("data delete in the middle");
		System.out.println("ArrayList "+ remove_middle(arraylist));
		System.out.println("LinkedList "+remove_middle(linkedlist));
		
		System.out.println("data delete in order");
		System.out.println("ArrayList "+ remove_order(arraylist));
		System.out.println("LinkedList "+remove_order(linkedlist));
		
		
	}
	
	public static long add_order(List list) {
		long start = System.currentTimeMillis();
//		return the current time as mill type
//		and put the result to start
		
		for(int i=0;i<1000000;i++) {
			list.add(i+"");
//			can get the result the time to take to get
		}
		
		long end=System.currentTimeMillis();
		
		return end-start;
	}
	
	public static long add_middle(List list) {
		long start=System.currentTimeMillis();
		
		for(int i=0;i<1000;i++) {
			list.add(500, "x");
		}
		
		long end=System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove_middle(List list) {
		long start=System.currentTimeMillis();
		
		for(int i=0;i<10000;i++) {
			list.remove(i);
		}
		
		long end=System.currentTimeMillis();
		return end-start;
	}

	public static long remove_order(List list) {
		long start=System.currentTimeMillis();
		
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		
		long end=System.currentTimeMillis();
		return end-start;
	}
	
}
