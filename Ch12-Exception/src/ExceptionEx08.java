@SuppressWarnings("serial")
class UserException extends Exception{
//	UserException is just name of class
//	after extended from Exception, UserException is belong to Exception
	public UserException(String str) {
		super(str);
	}
}



public class ExceptionEx08 {

	public static void main(String[] args) {
		int a=11;
		try{
			if(a<=0) {
				throw new UserException("it isn't a positive number");
//			usually create the Exception's object with throw
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
	}
		
	}


