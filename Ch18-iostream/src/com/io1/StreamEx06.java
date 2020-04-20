package com.io1;

import java.io.File;

public class StreamEx06 {

	public static void main(String[] args) {
		
		String drive;
		double totalSpace, usedSpace, freeSpace, usableSpace;
		
		File[]roots=File.listRoots();
//		it return the list of C,D drive
		for(File root:roots) {
			drive=root.getAbsolutePath();
			
			totalSpace=root.getTotalSpace()/Math.pow(1024, 3);
//			it returns the size in byte, long type
//			when it applies multiple, it change from byte to KB(1), MB(2), GB(3) with each multiple
			
			usableSpace=root.getUsableSpace()/Math.pow(1024, 3);
			
			freeSpace=root.getFreeSpace()/Math.pow(1024, 3);
			
			usedSpace=totalSpace-usableSpace;
			
			System.out.println("drive of hard disc is "+drive);
			System.out.println("total space is "+totalSpace+"GB");
			System.out.println("usable space is "+usableSpace+"GB");
			System.out.println("free space is "+freeSpace+"GB");
			System.out.println("used space is "+usedSpace+"GB");
			System.out.println();
			
		}
	}

}
