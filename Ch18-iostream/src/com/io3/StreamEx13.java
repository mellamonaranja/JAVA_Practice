package com.io3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StreamEx13 {

	public static void main(String[] args) throws IOException {
		char[]cbuf=new char[10];
		int readCnt;
		
		Reader in=new FileReader("FileReaderWriter.txt");
//		FileReader inherited by Reader object
		
		readCnt=in.read(cbuf,0,cbuf.length);
//		cbuf, off, len
//	cbuf Destination bufferoff Offset at which to start storing characterslen Maximum number of characters to read

		for(int i=0;i<readCnt;i++) {
			System.out.println(cbuf[i]);
		}
		in.close();
	}

}
