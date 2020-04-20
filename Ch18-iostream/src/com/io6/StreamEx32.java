package com.io6;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StreamEx32 {

	public static void main(String[] args) throws Exception {
String fileName = "UserInfo.ser";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream out = new ObjectOutputStream(bos);
		
		UserInfoNot user1 = new UserInfoNot("James Arthur Gosling", "javazzang", 62);
		UserInfoNot user2 = new UserInfoNot("Andy Rubin", "androidzzang", 54);
		
		ArrayList<UserInfoNot> list = 
				new ArrayList<UserInfoNot>();
		list.add(user1);
		list.add(user2);
		
		out.writeObject(user1);
		out.writeObject(user2);
		out.writeObject(list);
		
		out.close();
		System.out.println("Serialization가 수행되었습니다.");
		

	}

}
