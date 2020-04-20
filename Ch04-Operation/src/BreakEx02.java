
public class BreakEx02 {

	public static void main(String[] args) {
		
//		누적합계 구하기, 0입력 전까지 입력받은 정수의 누적합계 구하기
//		while, break
		
//			
int i=0;
int total = 0;		
		java.util.Scanner input = new java.util.Scanner(System.in);
//		System.out.println("0입력 전까지 입력한 수의 합");
		
		while(true){
		System.out.println("누적할 정수 입력>");
		i=input.nextInt();
		
		if(i==0) {
			break;
		}else {
			total +=i;
		}
		}
	

System.out.println("total :" +total);
	
}
}




