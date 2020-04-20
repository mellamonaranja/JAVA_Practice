package com.chat1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketEx extends Thread{

	ServerEx server;
	Socket socket;
	
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	
	String ipAddress;

	public SocketEx(ServerEx server, Socket socket) {
		
		try {
			
			this.server = server;
			this.socket = socket;
			
			dataInputStream = 
				new DataInputStream(
						socket.getInputStream());
			
			dataOutputStream =
				new DataOutputStream(
						socket.getOutputStream());
			
			ipAddress =
					socket.getInetAddress().toString();
			System.out.println(ipAddress + "�� �����Ͽ����ϴ�.");	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	} // SocketEx()

	@Override
	public void run() {

		String str;
		
		try {
			while(true) {
				str = dataInputStream.readUTF();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	
}
