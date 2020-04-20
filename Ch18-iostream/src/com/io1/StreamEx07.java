package com.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx07 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\CodeLab\\FirstJava.java");
			
			int data;
			
			while((data=fis.read())!=-1) {
//				if there is the end of file(EOF), it returns -1
				System.out.println(data);
				System.out.write(data);
//				print out in string type with write function
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
