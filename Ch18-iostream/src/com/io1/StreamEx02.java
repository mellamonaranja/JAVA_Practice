package com.io1;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class StreamEx02 {

	public static void main(String[] args) throws URISyntaxException {
		File f1=new File("C:\\windows\\system.ini");
//		one \ cannot work as its original function hence need to put one more
		File f2=new File("C:\\CodeLab\\workspace");
		File f3=new File("C://CodeLab");
		File f4=new File(new URI("file:///c://CodeLab//FirstJava.java"));
		
		String result;
		if(f1.isFile()) {
//			is it file? return true
			result="file";
		}else {
			result="directory";
		}
		System.out.println("f1 "+f1.getPath()+" is "+result);
		
		if(!f2.exists()){
			if(!f2.mkdir()) {
				System.out.println("directory produce failure");
			}
		}else {
			System.out.println("directory produce success");
		}
		if(f2.isFile()) {
			result="file";
		}else {
			result="directory";
		}
		System.out.println("f2 "+f2.getPath()+" is "+result);
		
		dir(f3);
	}
	
	public static void dir(File filedirectory) {
		String[]filenames=filedirectory.list();
		
		for(String s:filenames) {
//			file list is put into filenames as string type
			File f=new File(filedirectory, s);
			long t=f.lastModified();
//			return the millisecond(long type)when is last modified this file
			System.out.print(s);
			System.out.print("\t size of the file is "+f.length());
			System.out.printf("\t modified time is %tb %td %ta %tT\n", t, t, t, t);
		}
	}
}
