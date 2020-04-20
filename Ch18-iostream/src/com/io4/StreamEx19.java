package com.io4;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class StreamEx19 {
	
	public static void performanceTest(DataOutputStream dataOut) throws Exception {
		long starTime=System.currentTimeMillis();
		
		for(int i=0;i<1000;i++) {
			for(int j=0;j<1000;j++) {
				dataOut.writeDouble(12.145);
			}
		}
		dataOut.flush();
//		flush this data out stream
		
		long endTime=System.currentTimeMillis();
		System.out.println("the time elapsed is "+(endTime-starTime));
	}

	public static void main(String[] args) throws Exception {
		OutputStream out1=new FileOutputStream("fileterdata1.bin");
	
		DataOutputStream dataOut=new DataOutputStream(out1);
//		every stream object made by OutputStream can be put
		
		performanceTest(dataOut);
		
		dataOut.close();
		out1.close();
		
		OutputStream out2=new FileOutputStream("filterdata2.bin");
//		save the data with byte type
		BufferedOutputStream buffFilterout=new BufferedOutputStream(out2, 1024*10);
//		added buffer function
		DataOutputStream dataBuffOut=new DataOutputStream(buffFilterout);
		performanceTest(dataBuffOut);
		
		dataBuffOut.close();
		buffFilterout.close();
		out2.close();
	}

}
