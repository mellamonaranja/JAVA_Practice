package com.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue queue=new LinkedList();
//		ctrl+t : check the inheritance relationship
//		after check, LinkedList is inherited by Queue
		
		queue.offer("10");
		queue.offer("20");
		queue.offer("30");
		
		while(!queue.isEmpty()) {
//			if it isn't empty,
			System.out.println(queue.poll());
		}
	}

}
