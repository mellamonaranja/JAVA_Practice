package com.io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamEx10 {

	public static void main(String[] args) throws IOException {
		InputStream ips=new FileInputStream("origin.bin");
// possible to save to parent's type which is InputStream
		OutputStream ops=new FileOutputStream("copy.bin");
		int copyByte=0;
		int readLen;
		byte[]buf=new byte[1024];
//		2014byte is similar to 1kb
//		return to buffer type
		while(true) {
			readLen=ips.read(buf);
//			read method returns the byte to int type
			if(readLen==-1) {
				break;
			}
			ops.write(buf, 0, readLen);
//			write the buf, from off to len
			copyByte+=readLen;
		}
		System.out.println("the size of copy byte"+copyByte);
		ips.close();
		ops.close();
	}

}
