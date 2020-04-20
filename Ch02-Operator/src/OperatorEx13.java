
public class OperatorEx13 {
	
	public static void main(String [] args) {
		
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = (num1+=10)<0 && (num2+=10)>0;
//		my expectation 10<0 and 10>0 -->false
//		my expectation result=false, num1=10, num2=0(후조건 미실행으로)
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		System.out.println("result : "+ result);
		
		result = (num1+=10)>0 || (num2+=10)>0;
//		my expectation 20>0 or 10>0
//		num1=10, num2=0, result=true
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		System.out.println("result : "+ result);
		
		
	
		
		
		
		
		
		
		
	}

}
