
public class ThreadEx02 extends Thread{
	String tname;
	
	public ThreadEx02(String name) {
		tname=name;
	}

	@Override
	public void run() {
		while(true) {
//			infinity loop with true
			
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
//			print every 1 second out 
			System.out.println(tname);
		}
	}

	public static void main(String[] args) {
		ThreadEx02 threadex02=new ThreadEx02("Thread1");
		ThreadEx02 threadex022=new ThreadEx02("Thread2");
		threadex02.start();
		threadex022.start();
	}

}
