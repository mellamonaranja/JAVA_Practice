
public class ExceptionEx06 {

	public static void main(String[] args) {
		
		try {
			int num=Integer.parseInt(args[0]);
			System.out.println(num);
			
		}catch(Exception e) {
			System.out.println("wrong input");
//			it exception doesn't occur, execute try block primarily and goes to finally(skip execute catch)
//			once  exception occurs, execute catch block and goes to finally
//			regardless occur the error or not, finally executes always only within try block
		}finally {
			System.out.println("terminate the program");
			System.out.println("organize the resource");
		}
	}

}
