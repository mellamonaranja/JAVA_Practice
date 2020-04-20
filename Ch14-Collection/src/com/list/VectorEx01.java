package com.list;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {

//		Vector vector=new Vector();
//		any type of object can be put into ()
//		because we didn't declare () as a generic type
		
		Vector<Double> vector=new Vector<Double>();
		vector.add(new Double(100.3));
//		new object stored
		vector.add(3.14);
//		has been auto boxing(even without new Double)
		vector.add(1000.);
//		1000is int type and it cannot be auto boxing
//		therefore need . then it will be printed 1000.0
		
		for(Double e:vector) {
			System.out.println(e);
		}
		
		double search=1000.0;
		int index=vector.indexOf(search);
//		do find search
		
		if(index!=-1) {
			System.out.println("location of search "+ search + " is " + index);
		}else {
			System.out.println("no search "+ search);
		}
		
		double delete=3.14;
		if(vector.contains(delete)) {
//			if vector contains delete
			vector.remove(delete);
//			do remove delete(3.14)
			System.out.println(delete+" deleted");
		}
		System.out.println(vector);
	}

}
