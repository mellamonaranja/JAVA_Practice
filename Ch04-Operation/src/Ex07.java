
public class Ex07 {

	public static void main(String[] args) {
//		1~100까지의 숫자 중 홀수의 합/짝수의 합 구하는 프로그램
		
		int sum1=0;
		int sum2=0;
		for(int i=1;i<101;i++) {
						
			if(i%2==0) {
				sum1 = sum1 + i;
				
			}else{
				sum2 = sum2 + i;	
				}
			}
		System.out.println("짝수의 합" + sum1);
		System.out.println("홀수의 합" + sum2);
		}

	}


