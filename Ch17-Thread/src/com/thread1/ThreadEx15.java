package com.thread1;

class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread=targetThread;
	}

	@Override
	public void run() {
		while(true) {
			Thread.State state=targetThread.getState();
			System.out.println("state of thread is "+state);
			
			if(state==Thread.State.NEW) {
				targetThread.start();
			}
			if(state==Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class TargetThread extends Thread{

	@Override
	public void run() {
		for(long i=0;i<1000000000;i++) {
		}
		try {
			sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(long i=0;i<1000000000;i++) {
		}
	}
}
public class ThreadEx15 {

	public static void main(String[] args) {
		
		StatePrintThread spt=new StatePrintThread(new TargetThread());
		spt.start();
		
	}

}
