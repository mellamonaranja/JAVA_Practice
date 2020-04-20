
public class MethodEx07 {

	public void getNum(int num, int num2) {
		System.out.println("the number has been transfered is : " + num);	
	}
	
	public void argsTest(int ... n) {
//		variable arguments n is initialized
		
		for(int i=0;i<n.length;i++) {
			System.out.println("n[" + i + "]:" + n[i]); 
		}
	}
	
	
	public static void main(String[] args) {
		MethodEx07 me = new MethodEx07();
		
//		me.getNum(50);
		me.getNum(50,60);
//		me.getNum((int)5.6);
		
		me.argsTest(11);
		me.argsTest(22,33);
		me.argsTest(50,60,70);
		me.argsTest(100,200,300,400,500);
		me.argsTest();



	}

}
