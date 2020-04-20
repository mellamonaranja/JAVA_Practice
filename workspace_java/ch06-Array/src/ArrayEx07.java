
public class ArrayEx07 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
//		arr에는 각 방에 12345가 만들어지고, 시작 주소값이 arr에 들어가짐. 주소는 @something
		
		int[] ref;
//		ref = arr;
		
		ref = addArray(arr, 3);
		if(arr==ref) {
			System.out.println("동일한 배열 객체");
		}else {
			System.out.println("다른 배열 객체");
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+ i +"]:" + arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("ref["+ i +"]:" + ref[i]);
		}

	}
	public static int[] addArray(int[] arr, int addVal) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i]+=addVal;
		}
		return arr;
	}

}
