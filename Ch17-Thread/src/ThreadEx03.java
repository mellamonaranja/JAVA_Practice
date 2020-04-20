class ThreadA extends Thread{
//	the meaning inherit is using run method, hence need to override run method
	public ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("processing is "+getName());
		}
	}
}

class ThreadB extends Thread{

	@Override
	public void run() {
	for(int i=0;i<3;i++) {
		System.out.println(getName());
		}
	}
	
}


public class ThreadEx03 {

	public static void main(String[] args) {
		Thread mainThread=Thread.currentThread();
//		it get from first to the end
//		returns a reference to currently executing thread object
		System.out.println("name of thread of start program is "+mainThread);
		
		ThreadA threada=new ThreadA();
		System.out.println("processing thread is "+threada.getName());
		
		ThreadB threadb=new ThreadB();
		System.out.println("processing thread is "+threadb.getName());
		threadb.start();
	}

}
