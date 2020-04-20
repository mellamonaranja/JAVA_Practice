
public class ArrayEx21 {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr1.length; i++) {

			System.out.println(arr1[i]);
		}

		for (int i : arr2) {
			System.out.println(i);
		}

		for (int i = 0; i < arr1.length; i++) {

			arr1[i] += 10;
//			10 is added to arr1's reference
			System.out.println(arr1[i]);

		}

		for (int i : arr2) {
			i += 10;
//			10 just is added to 1
			System.out.println(i);
		}

	}

}
