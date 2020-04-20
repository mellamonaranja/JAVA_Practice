class Capsule{
	
	private int a;
	
	public void setA(int n) {
		if(n>=0) {
			a=n;
		}else {
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
	
	public int getA() {
		return a;
	}
}

public class CapsuleMain {

	private int a;
	public void setA(int n) {
		a=n;
	}
	
	public int getA() {
		return a;
	
	}
	public static void main(String[] args) {
		CapsuleMain csm = new CapsuleMain();
		csm.a=10;
		System.out.println(csm.a);
		
		csm.a=-10;
		System.out.println(csm.a);
		
		Capsule cs = new Capsule();
		cs.setA(200);
		System.out.println(cs.getA());
		
		cs.setA(-100);
		System.out.println(cs.getA());
	}
}


