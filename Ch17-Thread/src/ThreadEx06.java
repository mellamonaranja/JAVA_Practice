import java.awt.Frame;
import java.awt.Graphics;

public class ThreadEx06 extends Frame implements Runnable{
//	if make the class execute the thread, need to implement
	int x, y;

	@Override
	public void run() {
		while(true) {
			x=(int)(Math.random()*300);
			y=(int)(Math.random()*300);
//			int value from 0 to 300
			
			repaint();
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(Graphics g) {
		g.drawOval(x, y, 30, 30);
	}

	public ThreadEx06() {
		setTitle("Thread Test");
	}
	
	public static void main(String[] args) {
		ThreadEx06 threadex06=new ThreadEx06();
		threadex06.setSize(300,300);
		threadex06.setVisible(true);
		
		Thread thread=new Thread(threadex06);
		thread.start();
	}

}
