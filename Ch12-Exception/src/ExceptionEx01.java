
public class ExceptionEx01 {

	public static void main(String[] args) {
		int[]var= {10,20,30};
		for(int i=0;i<=3;i++) {
			
		
//		occurred exception usually use the array like this
		
		try {
			
				System.out.println(var[i]);
			
//			insert the error occurred within the try block{}
		}catch(ArrayIndexOutOfBoundsException e) {
//			makes the object of error
//			e.printStackTrace();
//			show the trace how it catches and message
//			System.out.println(e.toString());
		}
		
	}
		System.out.println("terminate the program");
	}
}
