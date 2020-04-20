

class ThreadWithClass extends Thread{
	public ThreadWithClass() {
		setName("ThreadWithClass");
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName());
			try {
				sleep(1000);
//			1/1000 seconds
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadWithRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
//			1/1000 seconds
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadEx05 {

	public static void main(String[] args) {
		ThreadWithClass twc=new ThreadWithClass();
		Thread thread1=new Thread(new ThreadWithRunnable(), "ThreadWithRunnable1");
		twc.start();
		thread1.start();
		
		Thread thread2=new Thread(new ThreadWithRunnable(), "ThreadWithRunnable2");
		thread2.start();
	}

}

