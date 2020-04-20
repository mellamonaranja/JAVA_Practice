package com.thread1;

class WorkObject{
	public synchronized void methodA() {
		System.out.println("ThreadA methodA()");
		
		notify();
//		methodB has been notified with this method
//		methodB was waiting
//		wakey wakey B
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		A need to wait because B woke up
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB methodB()");
		notify();
//		wakey wakey A	
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		B need to wait because A woke up
	}
}
// notify, wait is executed within synchronized only
// with notify, wait, can be shift
// without notify, wait, executes in order(A->B)

class ThreadA extends Thread{
	private WorkObject WO;
	
	public ThreadA(WorkObject WO) {
		this.WO=WO;
	}

	@Override
	public void run() {
		for(long i=0;i<10;i++) {
			WO.methodA();
		}
	}
}

class ThreadB extends Thread{
	private WorkObject WO;
	
	public ThreadB(WorkObject WO) {
		this.WO=WO;
	}

	@Override
	public void run() {
		for(long i=0;i<10;i++) {
			WO.methodB();
		}
	}
}

public class ThreadEx16 {

	public static void main(String[] args) {
		WorkObject sharedObject=new WorkObject();
		ThreadA a=new ThreadA(sharedObject);
		ThreadB b=new ThreadB(sharedObject);
		
		a.start();
		b.start();
	}

}
