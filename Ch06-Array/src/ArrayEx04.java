//최대값, 최소값 구해주는 프로그램
//배열에 저장된 값 중 최대갑, 최소값만 출력
//예상출력결과 최대값100 최소값33

public class ArrayEx04 {

	public static void main(String[] args) {
		
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length;i++) {
//			i=1인 이유는 0번째 값 79는 비교해봤자 같기 때문
			System.out.println(score[i]);
			if(score[i]>max) {
				max = score[i];
//				
			}
			if(score[i]<min) {
				min=score[i];
			}
		}
		
		System.out.println("max:"+ max);
		System.out.println("min:"+ min);
		
	
		

	}

}
