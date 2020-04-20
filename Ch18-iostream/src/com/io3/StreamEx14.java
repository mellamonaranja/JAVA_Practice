package com.io3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class StreamEx14 {

	public static void main(String[] args) {
		FileReader fr=null;
		
		int readChar;
		
		try {
			fr = new FileReader("C:"+File.separator+"CodeLab"+File.separator+"file.txt");
			
			try {
				while((readChar=fr.read())!=-1){
//					read one by one with read method
					System.out.print((char)readChar);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
