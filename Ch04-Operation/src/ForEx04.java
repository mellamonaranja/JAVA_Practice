
public class ForEx04 {

	public static void main(String[] args) {
		
//		for�̿��Ͽ�, �ܿ� �ش��ϴ� ���� �ϳ��� �Է¹޾�, �ش� ���� �������� ���
//		
		int dan;
		
		java.util.Scanner input= new java.util.Scanner(System.in);
		System.out.println("�� �Է�>");
//		'�� �Է�'���
		
		dan=input.nextInt();
//		i�Է� ��ġ �ϼ�		
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "X" + i + "=" + dan*i);
			
		}
		
	

	}

}
