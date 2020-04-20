package com.list;

import java.util.Vector;

public class VectorEx02 {
	
	public static void print(Vector vector) {
		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
	}

	public static void main(String[] args) {
		Vector vector=new Vector(5);
//		declare the capacity as 5, didn't declare the size yet
		
		print(vector);
		
		vector.add("10");
		vector.add("20");
		vector.add("30");
//		size is 3 but capacity is still 5
		print(vector);
		
		System.out.println();
		vector.trimToSize();
//		remove the empty space(currently 2 is empty)
		print(vector);
//		capacity has been decreased to 3
//		at this moment, the reference address changed when capacity is changed
//		it creates new array and copied existing contents
		
		System.out.println();
		vector.ensureCapacity(6);
//		ensured the empty space(capacity changed from 3 to 6) and also the reference address changed
		print(vector);
		
		System.out.println();
		vector.setSize(7);
		print(vector);
//		when vector size is bigger than vector, vector creates multiply twice with current capacity(6*2=12)
		
		System.out.println();
		vector.clear();
		print(vector);
//		when clear, every size deleted but capacity still remain with 12
	}

}
