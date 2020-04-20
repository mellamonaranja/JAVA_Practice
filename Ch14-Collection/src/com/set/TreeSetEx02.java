package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		
		int[]score= {88,97,50,34,45,65,10,100};
		
		for(int i=0;i<score.length;i++) {
			treeset.add(new Integer(score[i]));
//			treeset.add(score[i]); //<--is same way as upper
		}
		System.out.println(treeset);
//		it printed out in a row from smaller to bigger
		
		System.out.println("value smaller than 50 is "+treeset.headSet(50));
//		it doesn't include end value
		System.out.println("value bigger than 50 is "+treeset.tailSet(50));
//		it includes first value
		
		Iterator<Integer> iterator=treeset.iterator();
		
		System.out.println(treeset.add(100));
//		there is 100 already therefore it get result false
//		??
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
//			it printed out in a row
		}
	}

}
