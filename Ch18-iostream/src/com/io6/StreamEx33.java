package com.io6;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class StreamEx33 {

	public static void main(String[] args) throws Exception {
		String fileName = "UserInfo.ser";
		
		FileInputStream fis =
				new FileInputStream(fileName);
		BufferedInputStream bis =
				new BufferedInputStream(fis);
		ObjectInputStream in =
				new ObjectInputStream(bis);
		
		UserInfoNot user1 =(UserInfoNot) in.readObject();
		UserInfoNot user2 =(UserInfoNot) in.readObject();
		ArrayList list = (ArrayList) in.readObject();
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(list);
		
		in.close();
		bis.close();
		fis.close();
		
	}

}
