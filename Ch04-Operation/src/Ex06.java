
public class Ex06 {

	public static void main(String[] args) {
		// �ƽ�Ű �ڵ�ǥ ��� ���α׷�
//		0~127������ �ƽ�Ű 10�� ���� ���ڸ� ������ִ� ���α׷�
//		���� ��� ��� 
//		100<tab> d
//		101<tab> e
//		������ 20�ึ�� ǥ���ϱ�
//		10����   �ƽ�Ű����
		
		for(int i=0;i<128;i++) {
			if(i%20==0) {
			System.out.printf("10����\t�ƽ�Ű����\n)", i);
		}
		
		System.out.printf("%d\t%c\n", i, i);		
		
		
	}

}
}
