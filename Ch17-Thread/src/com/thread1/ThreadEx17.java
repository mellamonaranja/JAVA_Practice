package com.thread1;

class DataBox{
	private String data;
//	data is shared by returnValue=data; and this.data=data
	public synchronized String getData() {
		if(this.data==null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue=data;
		
		System.out.println("The data has been read by ConsumerThread"+returnValue);
		data=null;
		
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		
		if(this.data!=null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.data=data;
		System.out.println("The data has been produced by ProducerThread"+data);
		
		notify();
	}
}

class ProducerThread extends Thread{
	private DataBox databox;
//	shared object
	public ProducerThread(DataBox databox) {
		this.databox=databox;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			String data="Data-"+i;
			databox.setData(data);
		}
	}
}

class ConsumerThread extends Thread{
	private DataBox databox;
	public ConsumerThread(DataBox databox) {
		
		this.databox=databox;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			String data=databox.getData();
		}
	}
}

public class ThreadEx17 {

	public static void main(String[] args) {
		DataBox databox=new DataBox();
		ProducerThread pt=new ProducerThread(databox);
		ConsumerThread ct=new ConsumerThread(databox);
		
		pt.start();
		ct.start();
	}
}
