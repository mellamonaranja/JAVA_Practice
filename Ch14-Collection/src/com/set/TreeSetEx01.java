package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		treeset.add(new Integer(7));
		treeset.add(1);
		treeset.add(5);
		treeset.add(2);
		treeset.add(4);
		treeset.add(3);
		
		System.out.println("stored data is "+treeset.size());
		
		Iterator<Integer> iterator=treeset.iterator();
//		Every collection classes has iterator structure
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

class TreeNode{
	Object element;
	TreeNode left;
	TreeNode right;
//	this is Treenode structure sample 
//	smaller value is placed at left and bigger is placed at right, standard current value
}