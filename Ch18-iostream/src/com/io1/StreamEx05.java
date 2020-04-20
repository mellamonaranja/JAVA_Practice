package com.io1;

import java.io.File;

public class StreamEx05 {

	public static void main(String[] args) {
		System.out.println("==create the directory==");
		
		File f=new File("C:"+File.separator+"CodeLab"+File.separator+"dataSample");
//		going to create the new directory which name is dataSample
		System.out.println(f.mkdir());
//		make the directory function with mkdir
//		one more execute, it return true because there is already file which has created upper
		System.out.println("==remove the directory==");
		if(f.delete()) {
			System.out.println(f.getName()+" of this directory has deleted ");
		}else {
			System.out.println("there is no directory");
		}
	}

}
