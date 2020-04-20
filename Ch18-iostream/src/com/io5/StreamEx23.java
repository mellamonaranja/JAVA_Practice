package com.io5;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class StreamEx23 {

	public static void main(String[] args) throws Exception {
		String fname;
		String buff;
		String tmp;
		
		fname="frw.txt";
		
		
		new InputStreamReader(System.in);
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
// 		with System.in, binary byte is put and changed to character from byte type with InputStreamReader
//		new BufferedReader(), within () only allows reader object
		//		within () 
		buff="";
		tmp=r.readLine();
		
		while(tmp!=null) {
			buff+=tmp;
			tmp=r.readLine();
		}
		FileWriter fw=new FileWriter(fname);
		fw.write(buff, 0, buff.length());
//		cbuf, off, len
		fw.close();
		r.close();
	}

}
