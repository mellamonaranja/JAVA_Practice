package com.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorEx03 {

	public static void main(String[] args) {
		LinkedList<String> linkedlist=new LinkedList<String>();
		
		linkedlist.add("10");
		linkedlist.add("20");
		linkedlist.add("30");
		linkedlist.add("40");
		linkedlist.add("50");

		ListIterator<String>listiterator=linkedlist.listIterator();
//		ListIterator is round way, not one way
		
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		System.out.println();
		
		while(listiterator.hasPrevious()) {
//			is there previous data?
//			because ListIterator can check the data round way
			System.out.println(listiterator.previous());
//			it get result reverse way
		}
	}

}
