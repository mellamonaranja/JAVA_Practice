package com.io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx09 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		byte[]readArray;
		
		try {
			fis=new FileInputStream("C:\\CodeLab\\file.txt");
			
			readArray=new byte[fis.available()];
//			with available method, returns an estimate of the number of remaining bytes that can be read
			fis.read(readArray);
			System.out.println(new String(readArray));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
