package com.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx08 {
	
	public static void print(ArrayList arraylist1, ArrayList arraylist2) {
		System.out.println(arraylist1);
		System.out.println(arraylist2);
	}

	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>(10);
		
		arraylist.add(new Integer(5));
		arraylist.add(new Integer(4));
		arraylist.add(new Integer(2));
		arraylist.add(new Integer(0));
		arraylist.add(new Integer(1));
		arraylist.add(new Integer(3));
		
		
		System.out.println(arraylist);
//		it printed 10th index array, not number 10
		
		ArrayList arraylist2=new ArrayList(arraylist.subList(1, 4));
//		extract the list from arraylist range from index 1 to index 3(exclusive of 4)
		
//		another new arraylist object from arraylist index but only 
		print(arraylist, arraylist2);
		
		Collections.sort(arraylist);
		Collections.sort(arraylist2);
//		line up in an order with sort method
		
		print(arraylist, arraylist2);
		
		System.out.println(arraylist.containsAll(arraylist2));
//		return true if arraylist contains all of the element of arraylist2
		
		arraylist2.add("B");
		arraylist2.add("c");
		System.out.println(arraylist2);
		
		arraylist2.add(3, "a");
		arraylist2.set(3, "aa");
		System.out.println(arraylist2);
		
		System.out.println(arraylist.retainAll(arraylist2));
		print(arraylist, arraylist2);
//		leave duplicate value in arraylist from arraylist2
		
		for(int i=arraylist2.size()-1;i>=0;i--) {
			if(arraylist.contains(arraylist2.get(i))) {
				arraylist2.remove(i);
//				remove the duplicate values from arraylist2
			}
		}
		print(arraylist, arraylist2);
	}

}
