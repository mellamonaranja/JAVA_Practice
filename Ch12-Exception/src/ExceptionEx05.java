
public class ExceptionEx05 {
	
	public void methodA(String[]n) throws Exception{
//		throws is transferred processing
		if(n.length>0) {
			for(int i=0;i<n.length;i++) {
				System.out.println(i + n[i]);
			}
		}else {
			throw new Exception("no input data");
//			occur the error intentionally and throws to up there
			
		}
	}

	public static void main(String[] args) {
		ExceptionEx05 ex05=new ExceptionEx05();
		
		try {
			
			ex05.methodA(args);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	

}
