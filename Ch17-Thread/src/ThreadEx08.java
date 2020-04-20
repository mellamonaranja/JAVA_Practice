class ThreadTest01 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("-");
		}
	}
}

class ThreadTest02 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("*");
		}
	}
}

public class ThreadEx08 {

	public static void main(String[] args) {
		ThreadTest01 threadtest01=new ThreadTest01();
		ThreadTest02 threadtest02=new ThreadTest02();
		
		threadtest01.setPriority(3);
		threadtest02.setPriority(7);
		
		System.out.println("th1(-): "+threadtest01.getPriority());
		System.out.println("th1(*): "+threadtest02.getPriority());

		threadtest01.start();
		threadtest02.start();
		
	}

}
