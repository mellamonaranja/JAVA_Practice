package com.list;

import java.util.Stack;

public class StackEx03 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	
		
	public static void main(String[] args) {
		goURL("Naver");
		goURL("Google");
		goURL("Daum");
		goURL("Yahoo");
		
		printStatus();
		
		System.out.println("click back>");
		goBack();
		printStatus();
		
		goForward();
		System.out.println("click forward>");
		printStatus();
		
		System.out.println();
		goURL("d");
		printStatus();
		
	}
	
	public static void goURL(String url) {
		back.push(url);
//		when click the back button, the latest data goes out first
		
		if(!forward.empty()) {
			forward.clear();
		}
	}
	
	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
//			??
		}
	}
	
	public static void goBack() {
		if(!back.empty()) {
//			the function of empty() is same as isEmpty()
			forward.push(back.pop());
//			??
		}
	}
	public static void printStatus() {
		System.out.println("back"+back);
		System.out.println("forward"+forward);
		System.out.println("current page is '"+back.peek()+"'");
		
		System.out.println();
	}

}
