package com.chat1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	
	ServerSocket server;
	Socket socket;
	SocketEx client;
	
	
	public ServerEx() {
		
		try {
			server = new ServerSocket(5000);
			
			while(true) {
				System.out.println("Server waitting");
				
				socket = server.accept();
				
				
				client = new SocketEx(this, socket);
				client.start();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {

		ServerEx se = new ServerEx();
		
		
	}

}
