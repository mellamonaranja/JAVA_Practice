class Sum{
	int num;
	public Sum() {
		num=0;
	}
	
	public void addNumber(int n) {
		num+=n;
	}
	
	public int getNumber() {
		return num;
	}
}

class AdderThread extends Thread{
	Sum sumInst;
	int start;
	int end;
	public AdderThread(Sum sumInst, int start, int end) {
		super();
		this.sumInst = sumInst;
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
			sumInst.addNumber(i);
		}
	}
}
public class ThreadEx12 {

	public static void main(String[] args) {
		Sum sum=new Sum();
		AdderThread at1=new AdderThread(sum,1,50);
		AdderThread at2=new AdderThread(sum,51,100);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		System.out.println("sum from 1 to 50 is "+ sum.getNumber());
		System.out.println("sum from 1 to 100 is "+ sum.getNumber());
		
	}

}
