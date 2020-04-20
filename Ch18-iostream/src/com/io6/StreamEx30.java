package com.io6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StreamEx30 {

	public static void main(String[] args) throws Exception {

		String fileName = "UserInfo.ser";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream out = new ObjectOutputStream(bos);
		
		UserInfo user1 = new UserInfo("James Arthur Gosling", "javazzang", 62);
		UserInfo user2 = new UserInfo("Andy Rubin", "androidzzang", 54);
		
		ArrayList<UserInfo> list = 
				new ArrayList<UserInfo>();
		list.add(user1);
		list.add(user2);
		
		out.writeObject(user1);
		out.writeObject(user2);
		out.writeObject(list);
		
		out.close();
		System.out.println("Serialization가 수행되었습니다.");
		
		
	}

}
