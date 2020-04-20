package com.io6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamEx26 {

	public static void main(String[] args) throws Exception {

		OutputStream out = 
				new FileOutputStream("datastream.bin");
		
		DataOutputStream filterOut =
				new DataOutputStream(out);
		
		filterOut.writeInt(375);
		filterOut.writeDouble(35.67);
		filterOut.writeBoolean(true);
		
		filterOut.close();
		out.close();
		
		InputStream in = 
				new FileInputStream("datastream.bin");
		
		DataInputStream filterIn =
				new DataInputStream(in);
		
		
		int num1 = filterIn.readInt();
		double num2 = filterIn.readDouble();
		boolean bool = filterIn.readBoolean();
		
		filterIn.close();
		in.close();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bool);
		
		
		
		
		
		
	}

}
