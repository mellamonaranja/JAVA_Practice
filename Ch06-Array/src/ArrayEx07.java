
public class ArrayEx07 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
//		arr���� �� �濡 12345�� ���������, ���� �ּҰ��� arr�� ����. �ּҴ� @something
		
		int[] ref;
//		ref = arr;
		
		ref = addArray(arr, 3);
		if(arr==ref) {
			System.out.println("������ �迭 ��ü");
		}else {
			System.out.println("�ٸ� �迭 ��ü");
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
