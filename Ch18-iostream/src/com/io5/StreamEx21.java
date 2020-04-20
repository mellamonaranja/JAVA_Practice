package com.io5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx21 {

	public static void main(String[] args) {
		new InputStreamReader(System.in);
//		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
		while(true) {
				str=in.readLine();
				
				if(str==null) {
					break;
				}
				System.out.println(str);
				
			}//while
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(in!=null) {
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}//finally
	}
}

