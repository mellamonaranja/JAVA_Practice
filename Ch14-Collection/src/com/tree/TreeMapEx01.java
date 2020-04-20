package com.tree;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap=new TreeMap<Integer, String>();
		
		treemap.put(30, "thirty");
		treemap.put(10, "ten");
		treemap.put(50, "fifty");
		treemap.put(40, "fourty");
		treemap.put(20, "twenty");
		
		System.out.println(treemap.keySet());
		
		for(Integer keyinformation:treemap.keySet()) {
			System.out.println(keyinformation+treemap.get(keyinformation));
			
			treemap.remove(40);
			Iterator<Integer> iteratorkey=treemap.keySet().iterator();
			while(iteratorkey.hasNext()) {
				Integer key=iteratorkey.next();
				System.out.println(key+treemap.get(key));
			};
			System.out.println();
			treemap.replace(20, "TWENTY");
			
			for(Integer keyinformation1:treemap.keySet()) {
				String.format("key: %s, Value: %s", keyinformation1,treemap.get(keyinformation1));
			};
		}
		System.out.println();
		
		System.out.println(treemap.size());
		
	}

}
