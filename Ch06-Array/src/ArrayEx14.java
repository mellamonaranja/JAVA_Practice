import java.util.Arrays;
public class ArrayEx14 {

	public static void main(String[] args) {
		
		char[]alphaArr= {'A', 'D', 'C', 'B', 'E', 'F', 'G'};
		System.out.println("before sorting>");
		System.out.println(Arrays.toString(alphaArr));
		//if input the signature, it will be return with String type from import java.util.Arrays; with toString
//		alphaArr arrays isn't arrayed in a row, it is arrayed randomly
		
		System.out.println("index of C:" + Arrays.binarySearch(alphaArr, 'C'));
//		searching where is C in the array with using Arrays.binarySearch
//		it appears -5 because it isn't arrayed
		
		Arrays.sort(alphaArr);
		System.out.println("after sorting>");
		System.out.println(Arrays.toString(alphaArr));
//		making in a row with Arrays.sort
		
		System.out.println("index of C:" + Arrays.binarySearch(alphaArr, 'C'));
//		searching where is C in the array with using Arrays.binarySearch after made in a row
	}

}
