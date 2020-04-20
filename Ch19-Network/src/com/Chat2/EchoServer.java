package com.chat2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private ServerSocket serverSocket;
	private BufferedReader bufferR;
	private BufferedWriter bufferW;
	private InputStream is;
	private OutputStream os;
	
	public EchoServer(int port) {
		
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			
			try {
				
				System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��...");
				
				Socket tcpSocket = serverSocket.accept();
				
				System.out.println("Ŭ���̾�Ʈ�� IP�ּ�: " + 
						tcpSocket.getInetAddress().getHostAddress());
				
				is = tcpSocket.getInputStream();
				bufferR = new BufferedReader(
						new InputStreamReader(is) );
				
				os = tcpSocket.getOutputStream();
				bufferW = new BufferedWriter(
						new OutputStreamWriter(os));
				
				String message = bufferR.readLine();
				
				System.out.println("���� �޽���: " + message);
				
				message = message+ System.getProperty("line.separator");
				
				bufferW.write(message);
				bufferW.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(bufferW!=null) {
						bufferW.close();
					}
					if(os!=null) {
						os.close();
					}
					
					if(bufferR!=null) {
						bufferR.close();
					}
					if(is!=null) {
						is.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new EchoServer(3000);
	}

}
