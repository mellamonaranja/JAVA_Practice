package com.io3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StreamEx15 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\CodeLab\\FirstJava.java");
		FileReader fr=new FileReader(file);
		
		int readCharNo;
		
		char[]cbuf=new char[100];
		
		
		while((readCharNo=fr.read(cbuf))!=-1) {
			String data=new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		
		
	}

}
