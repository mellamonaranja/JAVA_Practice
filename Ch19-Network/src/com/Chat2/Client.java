package com.chat2;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Frame implements Runnable{
	
	TextField tf;
	TextArea ta;

	Socket sock;

	DataInputStream din;
	DataOutputStream dout;
	
	String chatid="[codedragon]";
	
	public Client() {
		setLayout(new FlowLayout());
		
		tf = new TextField(30);
		ta = new TextArea(7, 30);
		
		add(tf);
		add(ta);
		
		tf.addActionListener(new TfHandler());
		
	}
	
	public class TfHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			sendMsg(tf.getText());
			tf.setText("");
		}
		
	}
	
	public void sendMsg(String msg) {
		try {
			dout.writeUTF(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client chatc = new Client();
		chatc.setSize(300, 220);
		chatc.setVisible(true);
		
		Thread t = new Thread(chatc);
		t.start();
	}

	@Override
	public void run() {

		try {
			sock = new Socket("192.168.0.152", 5000);
			
			din = new DataInputStream(
					sock.getInputStream());
			
			dout = new DataOutputStream(
					sock.getOutputStream()); 
			
			ta.append("서버에 접속되었습니다.\n");
			
			while(true) {
				String str = din.readUTF();
				ta.append(str + "\n");
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
