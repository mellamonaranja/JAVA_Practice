package com.io5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StreamEx24 {

	public static void main(String[] args) throws IOException {
		BufferedWriter out=new BufferedWriter(new FileWriter("String.txt"));
		System.out.println("begin to input the data");
		
		out.write("ABC");
		out.newLine();
//		change the line using newLine method instead of \n at the end of "ABC"
		out.write("丑中之");
		out.newLine();
		out.write("ABC");
		out.newLine();
		out.write("丑中之");
		
		out.close();
		
		System.out.println("terminate to input the data");
	}

}
