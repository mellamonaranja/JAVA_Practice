
public class Ex07 {

	public static void main(String[] args) {
//		1~100������ ���� �� Ȧ���� ��/¦���� �� ���ϴ� ���α׷�
		
		int sum1=0;
		int sum2=0;
		for(int i=1;i<101;i++) {
						
			if(i%2==0) {
				sum1 = sum1 + i;
				
			}else{
				sum2 = sum2 + i;	
				}
			}
		System.out.println("¦���� ��" + sum1);
		System.out.println("Ȧ���� ��" + sum2);
		}

	}


