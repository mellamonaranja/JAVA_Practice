
public class BreakEx05 {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				
				if(j==3) {
					break;
//					j�� 3�� �Ǵ� ���� �� ���� ��������, �� 3�� ���� �� ��
				}
				System.out.println(i + "," + j);

			}
				
						}

		System.out.println("=========");
		exit_for:
//			�ݺ����� �ٷ� ���� exit_for:��� ���̺��� ������
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) {
					break exit_for;
//					j�� 3�� �Ǵ� ����  break exit for ������ ��/�ܺθ� �Ѳ����� ��������
				}
				System.out.println(i + "," + j);
			}
		}
	}

}
