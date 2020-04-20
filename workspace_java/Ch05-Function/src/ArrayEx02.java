
public class ArrayEx02 {

	public static void main(String[] args) {
		 
		int[] arr = {1,2,3,4};
//		arr이라는 index를 만듦
		System.out.println("arr 배열의 크기:" + arr.length);
//		이 배열의 크기를 확인하고자 함
//		크기 확인할 때는 배열명에 점.을 찍은 후 length를 붙이면 됨

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		
	}

}
