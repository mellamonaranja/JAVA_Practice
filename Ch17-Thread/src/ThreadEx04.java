//how to create thread
//1. create the class which is executed implements Runnable 
//2. run method need to be override, which is belong to Runnable
//3. create the class which has executed runnable
//4. when create the thread, setup the run method as a parameter of constructor
//5. start()

public class ThreadEx04 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
//				sleep method is belong to Thread however now is in interface hence need to put Thread
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("the name of thread is "+Thread.currentThread().getName()+",i value is "+i);
//			can get current thread name with currentThread, and get name
		}
	}

	public static void main(String[] args) {
		ThreadEx04 threadex04=new ThreadEx04();
		Thread thread=new Thread(threadex04);
//4. when create the thread, setup the run method as a parameter of constructor	
//		as a parameter, only allows only object inherited runnable interface
		thread.start();
	}

}
