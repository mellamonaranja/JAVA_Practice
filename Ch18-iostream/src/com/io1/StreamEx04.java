package com.io1;

import java.io.File;
import java.io.IOException;

public class StreamEx04 {

	public static void main(String[] args) {
		File f1=new File("C:"+File.separator+"CodeLab"+File.separator+"sample.txt");
//		going to make the file under the CodeLab file
		
		System.out.println("==create file==");
		try {
			System.out.println(f1.createNewFile());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!f1.exists()) {
			System.out.println("no exist file");
		}else {
			System.out.println("file exists");
		}
		
		System.out.println("\n===file details===");
		System.out.println("file absolute path is "+f1.getAbsolutePath());
		System.out.println("name of parent directory is "+f1.getParent());
		System.out.println("name of file is "+f1.getName());
		System.out.println("length of file is "+f1.length());
		System.out.println("right to writeis "+f1.canWrite());
		System.out.println("right to read is "+f1.canRead());
		
		System.out.println("==change the name of file==");
		File f2=new File("C:"+File.separator+"CodeLab"+File.separator+"sampleNameChanged.txt");
		System.out.println(f1.getName()+"->"+f2.getName());
		System.out.println(f1.renameTo(f2));
//		renameTo method is same function as move the file
		System.out.println("file absolute path is "+f2.getAbsolutePath());
		System.out.println("name of parent directory is "+f2.getParent());
		System.out.println("name of file is "+f2.getName());
		System.out.println("length of file is "+f2.length());
	}

}
