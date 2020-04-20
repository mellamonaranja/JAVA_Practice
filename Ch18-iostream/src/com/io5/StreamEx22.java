package com.io5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StreamEx22 {

	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			fw=new FileWriter("BufferedWriter.txt");
			bw=new BufferedWriter(fw);
			
			bw.write("BufferedWriter test");
			bw.newLine();
			bw.write("æ»≥Á«œººø‰"+System.getProperty("line.separator")+"hello BufferedWriter");
//			change the line with line.separator
//			same function as newLine
			System.out.println("file creates and put the content");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
