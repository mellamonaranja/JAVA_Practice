
public class WhileEx02 {

	public static void main(String[] args) {
		int i = 10;
//		while�� ����� ������ i�� ����
		
		while(i>=0) {
//			System.out.println(i++);
//			�� ��Ȳ������ ������ ���� ������ 10�̻��� ���� ���� �ݺ���
			System.out.println(i--);
//			������ �İ���, ���� i�� ����ϰ� ���� ���κ��� 1�� ���ҵ� �� ����
		}
		System.out.println("���� �� i: " + i);
		
		int j = 10;
		
		while(j>=0) {
			System.out.println(--j);
//			������ �� ����
		}
			System.out.println("���� �� j: " + j);
			
		}

	}


