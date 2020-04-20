class ThreadPriority10 extends Thread{
	String message;
	
	public ThreadPriority10(String str, int priority) {
		message=str;
		setPriority(priority);
	}
	
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(message+"("+getPriority()+")");
			
			try {
				sleep(1);
//				yield the thread to another one
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadEx10 {

	public static void main(String[] args) {
		ThreadPriority10 ThreadPriority10=new ThreadPriority10("first", Thread.MAX_PRIORITY);
		ThreadPriority10 ThreadPriority100=new ThreadPriority10("second", Thread.NORM_PRIORITY);
		ThreadPriority10 ThreadPriority1000=new ThreadPriority10("third", Thread.MIN_PRIORITY);
		
		ThreadPriority10.start();
		ThreadPriority100.start();
		ThreadPriority1000.start();
	}

}
