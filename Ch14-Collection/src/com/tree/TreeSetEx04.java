package com.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx04 {

	public static void main(String[] args) {
		TreeSet<Integer> treeset=new TreeSet<Integer>();

		treeset.add(30);
		treeset.add(40);
		treeset.add(50);
		treeset.add(20);
		treeset.add(10);
//		those treeset is stored in a row
		
		for(int i:treeset) {
			System.out.println(i);
//			treeset printed out in a row
		}
		System.out.println();
		
		treeset.remove(40);
		
		Iterator<Integer> iterator=treeset.iterator();
//				iterator made by iterator which circuit Integer
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(treeset.size());
		
		System.out.println(treeset.subSet(10, 20));
//		get the result from index 10 to right before 20 index, doesn't include 20
		System.out.println(treeset.subSet(10, true, 20, true));
		System.out.println(treeset.subSet(10, false, 20, false));
		
	}

}
