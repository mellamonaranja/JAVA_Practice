package com.io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx08 {

	public static void main(String[] args) {
		FileInputStream fis=null;
//		FileInputStream method can be read only one byte
//		hence if put the Korean character, cannot read properly
		int readbyte=0;
		
		try {
			fis=new FileInputStream("C:\\CodeLab\\file.txt");
			while((readbyte=fis.read())!=-1) {
				System.out.print((char)readbyte);
			}
			
			
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
