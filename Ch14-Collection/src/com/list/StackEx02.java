package com.list;

import java.util.Stack;

public class StackEx02 {

	public static void main(String[] args) {
		String[]arr= {"a", "b", "c", "d", "e", "f", "g"};
		Stack<String> stack=new Stack<String>();
//		create the stack object
		
		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
			stack.push(arr[i]);
//			do put the arr[i] into stack with using push
		}
		System.out.println(stack);
		
		
		while(!stack.isEmpty()) {
//			the function of isEmpty() is same as empty()
			System.out.println(stack.pop());
//			get the result with pop method

		}
		System.out.println(stack);
//		once execute the pop, stack became empty 
	}

}
