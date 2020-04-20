package com.list;

import java.util.ArrayList;

class A{

	@Override
	public String toString() {
		return "A";
	}
}

public class ArrayListEx01 {

	public static void main(String[] args) {
		System.out.println(new A());

		ArrayList arraylist=new ArrayList();
//		create an arraylist object
//		array class is stored generic type implicitly but, here, doesn't declare to generic type(E)
//		so it refers the top type of object
		
		arraylist.add(new A());
		arraylist.add(new Integer(100));
		arraylist.add("season");
//		only allows object in order to store
//		3 of arraylists were referred object type implicitly
		
		System.out.println(arraylist);
		
	}

}
