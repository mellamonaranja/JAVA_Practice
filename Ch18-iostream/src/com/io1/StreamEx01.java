package com.io1;

import java.io.IOException;

public class StreamEx01 {

	public static void main(String[] args) {
		
		try {
			int input=0;
			while((input=System.in.read())!=-1) {
//			in is an object of input stream
//			return -1 if input unproperly	
				System.out.println("input is "+input+" (char)input "+(char)input);
//				aschi code, the value of enter, so on also are printed(without char)
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
