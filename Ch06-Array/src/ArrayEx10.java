
public class ArrayEx10 {

	public static void main(String[] args) {
		
		int[][] arr= {
				{10},
				{20,30},
				{11,22,33,44,55,66},
				{40,50,60},
				{70,80,90,100}
//				index�ȿ� �󸶰� ���ֵ��� ������� ��ǻ�ʹ� �ϳ��� �ּҷ� �ν��ؼ� �����͸� ������ ����
//				���� ��� @wltwk ����
		};

		System.out.println("�迭�� �� ����: " + arr.length);
		System.out.println("�迭�� 0��° ����� ũ��: " + arr[0].length);
		System.out.println("�迭�� 1��° ����� ũ��: " + arr[1].length);
		System.out.println("�迭�� 2��° ����� ũ��: " + arr[2].length);
		System.out.println("�迭�� 3��° ����� ũ��: " + arr[3].length);
		System.out.println("�迭�� 4��° ����� ũ��: " + arr[4].length);
		
//		for(int i=0;i<=arr.length;i++) {
//			System.out.println("�迭" + i + "��° ����� ũ��" + arr[i].length);
//		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.println("arr[" + i + "][" + j + "] :" + arr[i][j]);	
			}
		}
	}

}
