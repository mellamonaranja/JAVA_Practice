package com.io6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StreamEx28 {

	public static void main(String[] args) {
		System.out.println("=== 객체 직렬화 ===");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		Customer c = new Customer("CodeDragon코드드레곤");
		
		
		try {
			fos = new FileOutputStream("object.ser");
			
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(c);
			
			System.out.println("객체 직렬화 완료!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if( fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
