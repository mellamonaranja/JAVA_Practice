package com.chat1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	
	static String serverIP = "192.168.100.7";

	public static void main(String[] args) {

		
		try {
			Socket socket = new Socket(serverIP, 5000);
			
			DataInputStream dataInputStream =
					new DataInputStream(
							socket.getInputStream());
			
			DataOutputStream dataOutputStream =
					new DataOutputStream(
							socket.getOutputStream());
			
			System.out.println("서버에 접속되었습니다.");
			
			while(true) {
				String str = dataInputStream.readUTF();
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
