package com.set;

import java.util.HashSet;
import java.util.Iterator;

class Number5{
	int num;
	
	public Number5(int num) {
		this.num=num;
	}

	@Override
	public String toString() {
		
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		return num%3;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		Number5 comp=(Number5)obj;
		if(num==comp.num) {
			return true;
		}else {
			return false;
		}
	}
}

public class HashSetEx05 {

	public static void main(String[] args) {

		HashSet<Number5> hashset=new HashSet<Number5>();
		hashset.add(new Number5(10));
		hashset.add(new Number5(20));
		hashset.add(new Number5(30));
		hashset.add(new Number5(20));
		hashset.add(new Number5(50));
		
		System.out.println(hashset.size());
		
		Iterator<Number5> iterator=hashset.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
