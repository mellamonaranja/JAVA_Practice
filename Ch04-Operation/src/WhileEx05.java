
public class WhileEx05 {

	public static void main(String[] args) {
		
		int i = 2;
		int j = 1;
		
		while(i<10) {
			System.out.println("�ܺ�:" + i);
			
			j = 1;
//			�ٱ����� j=1�� ��������� ������, �� �ȿ����� j=1�� �����ؾ���
			while(j<10) {
				System.out.println("�ܺ�:" + i + ", ����:" + j);
				j++;
			}
			i++;
		}
		
		

	}

}


