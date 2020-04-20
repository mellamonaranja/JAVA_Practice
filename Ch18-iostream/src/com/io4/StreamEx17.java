package com.io4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StreamEx17 {

	public static void main(String[] args) {
		InputStream is=System.in;
//		in is an object of inputstream
//		input with binary type
		
		Reader reader=new InputStreamReader(is);
//		sub InputStream
//		can be read from binary type to string type with InputStreamReader object
		
			try {
				while(true) {
				int i=reader.read();
				if(i==-1) {
					break;
				}
				char c=(char)i;
				System.out.print(c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
//				organize reverse order what created before
//				therefore 1. is 2. reader
				if(reader!=null) {
					try {
						reader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}if(is!=null) {
					try {
						is.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}

}
