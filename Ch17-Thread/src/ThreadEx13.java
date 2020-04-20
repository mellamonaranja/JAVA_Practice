class SharedData{
	int data;
	
	public SharedData() {
		data=0;
	}
	
	public synchronized void up(String name) {
		System.out.println(name+":"+data);
		data++;
		System.out.println("after increased data is "+data);
	}
	public synchronized void down(String name) {
		System.out.println(name+":"+data);
		data--;
		System.out.println("after decreased data is "+data);
	}
}
// this is critical section(up, down)
// need to be synchronized to lock
// after execute, it blocks with }

class Upthread extends Thread{
	SharedData data;
//	in order to up, need to have SharedData object
	String name;
	
	public Upthread(SharedData data, String name) {
		this.data=data;
		this.name=name;
	}

	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			data.up(name);
		}
	}
	
}

class DownThread extends Thread{
	SharedData data;
	String name;
	
	public DownThread(SharedData data, String name) {
		this.data=data;
		this.name=name;
	}

	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			data.down(name);
		}
	}
}
public class ThreadEx13 {

	public static void main(String[] args) {
		SharedData shareddata=new SharedData();
		Upthread upthread=new Upthread(shareddata, "Upthread");
		DownThread downthread=new DownThread(shareddata, "DownThread");
		
		upthread.start();
		downthread.start();
	}

}
