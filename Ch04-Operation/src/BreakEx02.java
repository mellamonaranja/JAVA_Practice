
public class BreakEx02 {

	public static void main(String[] args) {
		
//		�����հ� ���ϱ�, 0�Է� ������ �Է¹��� ������ �����հ� ���ϱ�
//		while, break
		
//			
int i=0;
int total = 0;		
		java.util.Scanner input = new java.util.Scanner(System.in);
//		System.out.println("0�Է� ������ �Է��� ���� ��");
		
		while(true){
		System.out.println("������ ���� �Է�>");
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




