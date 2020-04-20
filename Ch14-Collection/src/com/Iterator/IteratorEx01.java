package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
		arraylist.add("10");
		arraylist.add("20");
		arraylist.add("30");
		arraylist.add("40");
		arraylist.add("50");
		
		Iterator iterator=arraylist.iterator();
//		go circle within arraylist with iterator
		
		while(iterator.hasNext()) {
//			returns true if the iteration has more element
			Object object=iterator.next();
//			returns the next element in the iterator
//			every class is defined by object type implicitly
//			at this arraylist didn't declared the type upper therefore declare Object here
			System.out.println(object);
		}
	}

}
