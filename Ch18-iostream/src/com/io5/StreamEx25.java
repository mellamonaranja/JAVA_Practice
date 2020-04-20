package com.io5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StreamEx25 {

	public static void main(String[] args) throws Exception {
		BufferedReader in=new BufferedReader (new FileReader("String.txt"));
		String str;
		while(true) {
			str=in.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
	}

}
