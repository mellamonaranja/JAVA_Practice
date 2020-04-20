package com.io1;

import java.io.File;

public class StreamEx03 {

	public static void main(String[] args) {
		String path="C:\\";
		
		File f=new File(path);
		if(!f.exists() | !f.isDirectory()) {
			System.out.println("invalidate path");
			System.exit(0);
		}
		File[] files=f.listFiles();
		
		for(int i=0;i<files.length;i++) {
			File f2=files[i];
			
			if(f2.isDirectory()) {
				System.out.println("["+f2.getName()+"]");
			}else {
				System.out.printf("%s\t(%,dbytes)\n", f2.getName(), f2.length());
			}
		}
	}

}
