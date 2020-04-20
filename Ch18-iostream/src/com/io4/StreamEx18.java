package com.io4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamEx18 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("origin.bin");
		OutputStream out=new FileOutputStream("clone bin");
		
		BufferedInputStream bin=new BufferedInputStream(in);
		BufferedOutputStream bout=new BufferedOutputStream(out);
//		both of BufferedInputStream and BufferedOutputStream cannot create object itself 
//		hence they need InputStream, OutputStream
		
		int copyByte=0;
		int bData;
		
		while(true) {
			bData=bin.read();
			if(bData==-1) {
				break;
			}
			bout.write(bData);
			copyByte++;
		}
		bin.close();
		bout.close();
		
		in.close();
		out.close();
		
		System.out.println("the size of copied byte is "+copyByte);
	}

}
