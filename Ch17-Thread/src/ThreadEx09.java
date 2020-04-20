
public class ThreadEx09 extends Thread{
	String message;
	public ThreadEx09(String str, int priority) {
		message=str;
		setPriority(priority);
	}
	
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(message+"("+getPriority()+")");
		}
	}

	public static void main(String[] args) {
		ThreadEx09 threadex09=new ThreadEx09("first", Thread.MAX_PRIORITY);
		ThreadEx09 threadex099=new ThreadEx09("second", Thread.NORM_PRIORITY);
		ThreadEx09 threadex0999=new ThreadEx09("third", Thread.MIN_PRIORITY);
		
		threadex09.start();
		threadex099.start();
		threadex0999.start();
	}

}
