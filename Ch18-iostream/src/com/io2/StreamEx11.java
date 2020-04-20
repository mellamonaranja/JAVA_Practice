package com.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEx11 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:"+File.separator+"CodeLab"+File.separator+"fileOut.txt",false);
//			if use true in order to make file append(the content appended in a row)
//			if use false, cover over the same file, doesn't append
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				String message="FileOut";
		try {
			fos.write(message.getBytes());
			
			System.out.println("content has been saved after printed file out");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
