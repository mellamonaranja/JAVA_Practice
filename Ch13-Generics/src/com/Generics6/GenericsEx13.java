package com.Generics6;


public class GenericsEx13 {
	public static <T>void showArrayData(T[] arr) {
		
//		not declare T type yet
//		2. after call strArr with some type, T type will be declared 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(T e:arr) {
//			element of arr is T
//			T is put into e
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		String[] strArr=new String[] {
//				1. declared String, therefore public static <T>void showArrayData(T[] arr), the type of T is declared string implicitly
				"Hi! everyone",
				"a",
				"b",
				"c"
		};
		showArrayData(strArr);
	}

}
