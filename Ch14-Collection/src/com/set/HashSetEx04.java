/*package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetEx04 {

	public static void main(String[] args) {

		Set set=new LinkedHashSet();
		
		int[][] board=new int[5][5];
//		int[] board=new[25]
		
		for(int i=0;set.size()<25;i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		
		System.out.println(set);
		System.out.println(set.size());
		
		Iterator iterator=set.iterator();
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=Integer.parseInt((String)iterator.next());
				
				System.out.print((board[i][j]<10 ? "  " : " " ) + board[i][j]);
			}
			System.out.println();
		}
		
	}

}
*/
