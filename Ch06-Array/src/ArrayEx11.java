//�ݺ����� ����Ͽ� ������ ����, ��� ��� ���
//��ȣ ���� ���� ���� ���� ���
//1��    99 89 79 267 89

public class ArrayEx11 {

	public static void main(String[] args) {
		int[][]score= {
				{99,89,79},
				{58,68,78},
				{30,40,50},
				{66,77,88},
				{50,70,80}
		};
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		
		
		int num=1;
		num++;
		int sum=0;
				
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"��\t");
			for(int j=0;j<score[i].length;j++) {
				
				sum += score[i][j];
}
			System.out.print(sum+"\t");
			System.out.printf("%\2f", (float)sum/score[i].length);
			System.out.println();
		}
	}
}