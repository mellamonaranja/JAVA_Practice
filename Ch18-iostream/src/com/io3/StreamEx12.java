package com.io3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StreamEx12 {

	public static void main(String[] args) throws IOException {
		char ch1='J';
		char ch2='A';
		char ch3='V';
		char ch4='A';
		
		Writer out=new FileWriter("FileReaderWriter.txt");
		out.write(ch1);
		out.write(ch2);
		out.write(ch3);
		out.write(ch4);
		
		out.close();
	}

}
