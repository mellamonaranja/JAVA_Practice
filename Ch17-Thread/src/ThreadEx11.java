class MyRunnableTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("run");
		
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
	}
	
}
public class ThreadEx11 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"\t print 1");
		System.out.println(Thread.currentThread().getName()+"\t print 2");
		
		MyRunnableTwo mrt=new MyRunnableTwo();
		Thread thread=new Thread(mrt);
		thread.start();
//		it printed out after main print
//		in order to print in order, need to join
		
		try {
			thread.join();
//			once join executes, it stops and then go next
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"\t print 3");
		System.out.println(Thread.currentThread().getName()+"\t print 4");
	}

}
