
public class OverUnderFlowEx01 {
	public static void main(String[] args) {
		
		byte num1 = 127;
		byte num2 = -128;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		num1++;
		System.out.println("num3 = " + num1);
		
		num1++;
		System.out.println("num4 = " + num1);
		
		num2--;
		System.out.println("num5 = " + num2);
		
		num2--;
		System.out.println("num6 = " + num2);
		
		/*
		int num3 = 10;
		System.out.println("num3 = " + num3);
		num3--;
		System.out.println("num3 = " + num3);
		num3--;
		System.out.println("num3 = " + num3);
	*/
		
	
	
	}

}
