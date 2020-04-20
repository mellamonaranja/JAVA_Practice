package com.set;

import java.util.HashSet;
import java.util.Iterator;

class Number{
	int num;
	public Number (int num) {
		this.num=num;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	
}

public class HashSetEx02 {

	public static void main(String[] args) {
		HashSet<Number> hashset=new HashSet<Number>();
//		the data element allow to HashSet is from Number class
		hashset.add(new Number(10));
		hashset.add(new Number(20));
		hashset.add(new Number(30));
		hashset.add(new Number(40));
		
		System.out.println(hashset.size());
		
		Iterator<Number> iterator=hashset.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
