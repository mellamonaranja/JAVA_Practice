package com.tree;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapEx02 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap=new TreeMap<Integer, String>();

		treemap.put(7, "seven");
		treemap.put(1, "one");
		treemap.put(3, "three");
		treemap.put(5, "five");

		
		NavigableSet<Integer> navigable=treemap.navigableKeySet();
//		search-able in a row with NavigableSet function
		
		Iterator<Integer> iterator=navigable.iterator();
		
		while(iterator.hasNext()) {
//			Integer key=iterator.next();
			System.out.println(treemap.get(iterator.next()));
//			iterator.next() is same as key
		}
		System.out.println();
		
		iterator=navigable.descendingIterator();
//		iterator can be printed in a row with descending order
		while(iterator.hasNext()) {
			System.out.println(treemap.get(iterator.next()));
		}
	}

}
