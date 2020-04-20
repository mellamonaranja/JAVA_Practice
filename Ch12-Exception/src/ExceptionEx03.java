
public class ExceptionEx03 {

	public static void main(String[] args) {
		int var=10;
		
//		change string type 2 to int type from run as->
		
		
		try {
			int data=Integer.parseInt(args[0]);
			System.out.println(var/data);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("there is no input data");
		}catch(NumberFormatException e) {
			System.out.println("input the number");
		}catch(Exception e) {
//			Exception is the parent, if other error occurs, Exception will be handled
		}

		System.out.println("terminate the program");
	}

}
