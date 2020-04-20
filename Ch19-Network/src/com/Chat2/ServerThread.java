package com.chat2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {
	
	Server server;
	Socket sock;
	
	DataInputStream din;
	DataOutputStream dout;
	
	String ipAddr;

	public ServerThread(Server server, Socket sock) {
		
		try {
			
			this.server = server;
			this.sock = sock;
			
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			
			ipAddr = sock.getInetAddress().toString();
			System.out.println( ipAddr + "에서 접속하였습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // ServerThread()

	@Override
	public void run() {
		
		System.out.println("##ChatThread Start...");
		
		String str;
		
		try {

			while(true) {
				
				str = din.readUTF();
				server.sendAll(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // run()
	
	public void sendMsg(String msg) {
		try {
			dout.writeUTF(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
