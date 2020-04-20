
public class ArrayEx10 {

	public static void main(String[] args) {
		
		int[][] arr= {
				{10},
				{20,30},
				{11,22,33,44,55,66},
				{40,50,60},
				{70,80,90,100}
//				index안에 얼마가 들어가있든지 상관없이 컴퓨터는 하나의 주소로 인식해서 데이터를 가지고 있음
//				예를 들어 @wltwk 같은
		};

		System.out.println("배열의 행 길이: " + arr.length);
		System.out.println("배열의 0번째 요소의 크기: " + arr[0].length);
		System.out.println("배열의 1번째 요소의 크기: " + arr[1].length);
		System.out.println("배열의 2번째 요소의 크기: " + arr[2].length);
		System.out.println("배열의 3번째 요소의 크기: " + arr[3].length);
		System.out.println("배열의 4번째 요소의 크기: " + arr[4].length);
		
//		for(int i=0;i<=arr.length;i++) {
//			System.out.println("배열" + i + "번째 요소의 크기" + arr[i].length);
//		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.println("arr[" + i + "][" + j + "] :" + arr[i][j]);	
			}
		}
	}

}
