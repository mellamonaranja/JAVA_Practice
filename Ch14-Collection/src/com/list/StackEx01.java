package com.list;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack stack=new Stack();
		
		stack.push("10");
//		when put the data, use push method
		stack.push("20");
		stack.push("30");
		
		while(!stack.empty()) {
//			if stack has contents(means if stack isn't empty)
			System.out.println(stack.pop());
//			get the result using with pop method
		}
	}

}
