//반복문을 사용하여 점수와 총점, 평균 모두 출력
//번호 국어 영어 수학 총점 평균
//1번    99 89 79 267 89

public class ArrayEx11 {

	public static void main(String[] args) {
		int[][]score= {
				{99,89,79},
				{58,68,78},
				{30,40,50},
				{66,77,88},
				{50,70,80}
		};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		
		int num=1;
		num++;
		int sum=0;
				
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"번\t");
			for(int j=0;j<score[i].length;j++) {
				
				sum += score[i][j];
}
			System.out.print(sum+"\t");
			System.out.printf("%\2f", (float)sum/score[i].length);
			System.out.println();
		}
	}
}