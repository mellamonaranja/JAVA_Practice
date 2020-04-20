package com.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx02 {

	public static void main(String[] args) {
		HashSet<String> linkedlist=new HashSet<String>();
//		every class is defined by object type implicitly
		
		linkedlist.add("a");
		linkedlist.add(new String("b"));
//		"b" has been created implicitly but added to linkedlist
		linkedlist.add("c");
		linkedlist.add("d");
		linkedlist.add("e");
		
//		Iterator iterator=linkedlist.iterator();
//		created circle type of iterator
//		go round the element which is belong to iterator
		Iterator<String> iterator=linkedlist.iterator();
		
		while(iterator.hasNext()) {
//			returns true if the iteration has more element
			String string=iterator.next();
//			returns the next element in the iterator
			System.out.println(string);
			
//			if(string=="b") {
//			this string is same as linkedlist.add(new String("b")); and "b" is just the character created implicitly here
//				iterator.remove();
////				remove current position element 
//			}
//			the way 1.
			
			if(string.compareTo("b")==0) {
				iterator.remove();
			}
		}
//		recommendable when compare the content, rather than way 1
		
		System.out.println("call the iterator after remove the iterator");
//		there is no element because we pull out every data before
		iterator=linkedlist.iterator();
//		therefore in order to check new data, need to create the new iterator object
//		because iterator is executed only one way, not round way
		while(iterator.hasNext()) {
//			is there any elements?
			System.out.println(iterator.next());
//			if so, pull the result with next()
			
			
		}
		
	}

}
