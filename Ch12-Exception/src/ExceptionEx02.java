
public class ExceptionEx02 {

	public static void main(String[] args) {
		int[]var= {10,20,30};
	
//		it occurred out of bound error
		
		try {
			System.out.println("before error");
			System.out.println(var[4]);
//			when error occurred, it goes to catch, doesn't execute next(System.out.println("important message");)
			System.out.println("important message");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error-non exist index");
		}

	}

}
