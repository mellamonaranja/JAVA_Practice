class ATM implements Runnable{
	private long depositMoney=10000;
//	shared data
	
	public void withDraw(long howMuch) {
//		critical section
//	public synchronized void withDraw(long howMuch) {
//		way1. put the synchronized between public and void
		if(depositMoney>0) {
			depositMoney-=howMuch;
			System.out.println(Thread.currentThread().getName()+"\t"+depositMoney);
		}else {
			System.out.println(Thread.currentThread().getName()+"\t"+"no balance");
		}
	}

	@Override
	public void run() {
		
		synchronized(this) {
//			way2. put the for inside {}
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(depositMoney<=0) {
					break;
				}withDraw(1000);
			}
		}
	}
}

public class ThreadEx14 {

	public static void main(String[] args) {
		ATM atm=new ATM();
		Thread mother=new Thread(atm, "mother");
		mother.start();
		
		Thread son=new Thread(atm, "son");
		son.start();
//		two different objects are approaching to same shared data
//		wrong data printed out
		
	}

}
