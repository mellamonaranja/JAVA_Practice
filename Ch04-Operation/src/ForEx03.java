
public class ForEx03 {

	public static void main(String[] args) {
		// for문으로 1부터 100까지의 누적합을 구하는 프로그램
//		1부터 1까지의 누적합은 ??? 입니다
//		1부터 2까지의 누적합은 ??? 입니다
//		1부터 3까지의 누적합은 ??? 입니다
//		...
//		1부터 100까지의 누적합은 ??? 입니다
		
//		이 i값을 누적시킬 데이터 만들기
		int sum = 0;
				
		for(int i=1; i <=100; i++) {
			System.out.println("i:" +i);
			sum= sum + i;
//			sum에 i를 더한 다음 sum에 집어넣음ㅏ

//			1부터 1까지의 합은 얼마?...1부터 100까지의 합은 얼마?
			System.out.println("1부터" +i+"까지의 누적합은"+ sum);
		
			
		}
		
		System.out.println("sum" + sum);
	}

}
