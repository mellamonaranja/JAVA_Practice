
public class ThreadEx07 implements Runnable{

	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Name of thread is "+ Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadEx07 threadex07=new ThreadEx07();
		Thread thread1=new Thread(threadex07, "1");
		thread1.start();
		
		ThreadEx07 threadex077=new ThreadEx07();
		Thread thread2=new Thread(threadex077, "2");
		thread2.start();
		
		ThreadEx07 threadex0777=new ThreadEx07();
		Thread thread3=new Thread(threadex0777, "3");
		thread3.start();
		
		ThreadEx07 threadex07777=new ThreadEx07();
		Thread thread4=new Thread(threadex07777, "4");
		thread4.start();
	}

}
