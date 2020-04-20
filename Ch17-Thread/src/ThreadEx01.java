
public class ThreadEx01 extends Thread{
	public ThreadEx01(String threadname){
		super(threadname);
		}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {

			try {
				sleep(1000);
//				millisecond measure	
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("name of thread is "+ currentThread().getName()+", i value: "+i);
		}
	}
	


	public static void main(String[] args) {
		ThreadEx01 threadex01=new ThreadEx01("first");
		threadex01.start();
	}

}
