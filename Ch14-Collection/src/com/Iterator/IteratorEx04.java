package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx04 {

	public static void main(String[] args) {
		ArrayList original=new ArrayList(10);
		ArrayList copy1=new ArrayList(10);
		ArrayList copy2=new ArrayList(10);
		
		for(int i=0;i<10;i++) {
			original.add(i+"");
		}
		
		Iterator iterator=original.iterator();
//		with original method, create iterator circuit
//		this is circuit through original
		
		while(iterator.hasNext()) {
			copy1.add(iterator.next());
//			do add into copy1 if there is iterator data (iterator.next())
		}
		
		System.out.println("original is "+original);
		System.out.println("copy1 is "+copy1);
		
		iterator=original.iterator();
//		create iterator again
//		through original
		
		while(iterator.hasNext()) {
			copy2.add(iterator.next());
//			the content from original is moved to copy2
			iterator.remove();
		}
		System.out.println("after move");
		System.out.println("original is "+original);
		System.out.println("copy2 is "+copy2);
		
	}

}
