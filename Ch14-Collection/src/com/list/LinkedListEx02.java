package com.list;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx02 {

	public static void main(String[] args) {

		ArrayList arraylist=new ArrayList(1000000);
		LinkedList linkedlist=new LinkedList();
		
		add(arraylist);
		add(linkedlist);
		
		System.out.println("access time comparison");
		System.out.println("ArrayList is "+accessTime(arraylist));
		System.out.println("LinkedList is "+accessTime(linkedlist));
		
	}

	public static void add(List list) {
		for(int i=0;i<100000;i++) {
			list.add(i+" ");
		}
	}
	
	public static long accessTime(List list) {
		long start=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			list.get(i);
		}
		
		long end=System.currentTimeMillis();
		return end-start;
	}
}
