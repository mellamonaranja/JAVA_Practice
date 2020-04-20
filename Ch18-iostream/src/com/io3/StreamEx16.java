package com.io3;

import java.io.FileWriter;
import java.io.IOException;

public class StreamEx16 {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("fileWirter.txt");
			
			String message="FileWriter test";
			fw.write(message);
			System.out.println("file has been created and saved");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			if(fw!=null) {
				try {fw.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
	}

}
