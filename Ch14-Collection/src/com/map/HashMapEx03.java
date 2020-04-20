package com.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx03 {

	public static void main(String[] args) {
		HashMap<String, String> hashmap=new HashMap<String, String>();
		
		hashmap.put("myID", "pw");
		hashmap.put("a", "2019");
		hashmap.put("b", "2020");
		hashmap.put("b", "2021");
		
		System.out.println(hashmap);
		System.out.println(hashmap.size());
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("input the id and pw");
			System.out.println("id>");
			String id=scanner.nextLine().trim();
//			remove the space with trim()
			
			System.out.println("pw>");
			String pw=scanner.nextLine().trim();
			
			if(hashmap.containsKey(id)) {
//				if hashmap contains key(id)
				System.out.println("there isn't id. input again");
				continue;
			}else {
				if(!(hashmap.get(id)).equals(pw)) {
					System.out.println("it isn't match your pw. input again");
				}else {
					System.out.println("match your id and pw");
					break;
				}
			}
		}//while finish
		scanner.close();
	}

}
