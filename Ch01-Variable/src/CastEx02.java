
public class CastEx02 {
	
	public static void main(String [] args) {
		
		short num1= 10;
		short num2= 20;
		
		short result = (short)(num1 + num2);
		
		System.out.println(result);
//		(short+short) => int
//		(int)(short) => short
		
		int num3 = 10;
		int num4 = 20;
		short result2 = (short)(num3 + num4);
		System.out.println(result2);
		
		
	}

}
