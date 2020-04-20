package com.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx03 {

	public static void main(String[] args) {
//		LinkedList<String> linkedlist=new LinkedList<String>();
//		LinkedList is work properly
		ArrayList<String> linkedlist=new ArrayList<String>();
//		ArrayList is work properly as well
		
//		the difference between LinkedList and ArrayList is
//		LinkedList is data spread out on the other hand ArrayList is based on array
		
		
		linkedlist.add("a");
		linkedlist.add("d");
		linkedlist.add("b");
		linkedlist.add("e");
		linkedlist.add("c");
		
		for(int i=0;i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i));
		}
		System.out.println();
		linkedlist.remove(1);
		
		for(String e:linkedlist) {
			System.out.println(e);
		}
		System.out.println();
		linkedlist.set(2, "Z");
//		do change 2nd index value to Z
		
		for(String e:linkedlist) {
			System.out.println(e);
		}
		
		System.out.println("the size of linkedlist is "+linkedlist.size());
	}

}
