
public class ExceptionEx07 {

	public static void main(String[] args) {
		System.out.println("execute the program");
		
		try {
			System.out.println("2019");
//			executes
			System.out.println(50/0);
//			exception occurs
//			it goes to catch
			System.out.println("2020");
			
		}catch(Exception e) {
			System.out.println("exception processing");
			
		}finally {
			System.out.println("important message");
			
		}
		
		System.out.println("terminate the program");
	}

}
