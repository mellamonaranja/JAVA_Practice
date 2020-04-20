package com.io4;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx20 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			fos=new FileOutputStream("bufferOut.txt");
			bos=new BufferedOutputStream(fos);
//			buffer function has been added
			
			String str="BufferedOutputStream test";
						
			bos.write(str.getBytes());
			System.out.println("file has been created and saved");
//			change string to byte
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(bos!=null) {
						bos.close();
					}
					if(fos!=null) {
						fos.close();
					} 
				}catch (IOException e) {
						e.printStackTrace();
				}
			}
		}
}	
	


