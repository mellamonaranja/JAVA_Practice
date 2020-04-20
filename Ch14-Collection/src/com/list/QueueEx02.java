package com.list;

import java.util.LinkedList;

public class QueueEx02 {

	public static void main(String[] args) {
		
		String[]arr= {"a", "b", "c", "d", "e"}; 
		LinkedList<String> queue=new LinkedList<String>();
		
		for(String e:arr) {
//			String type arr in stored to store type e
			queue.offer(e);
		}
		System.out.println(queue);
		
		while(queue.peek()!=null) {
//			if the head of queue isn't null
			System.out.println(queue.poll());
//			pull the queue data
		}
		System.out.println(queue);
		System.out.println(queue.remove("a"));
//		get results false because every data has been pulled before therefore there is empty
	}

}
