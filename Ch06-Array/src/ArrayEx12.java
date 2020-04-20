import java.util.Arrays;
public class ArrayEx12 {

	public static void main(String[] args) {
	
		int[]arr1D= {10,20,30,40,50};
		int[][]arr2D= {
				{11,12,13},
				{21,22,23}
		};
		System.out.println(arr1D);
		System.out.println(Arrays.toString(arr1D));
//if input the signature, it will be return with String type from import java.util.Arrays;
		System.out.println(arr2D);
		System.out.println(Arrays.deepToString(arr2D));
//		arr2D is multiple arrays, so it needs to deepToString in order to print
		
		int[]arr1=Arrays.copyOf(arr1D, 3);
//		3means 3things
		System.out.println(Arrays.toString(arr1));
		
		int[]arr2=Arrays.copyOf(arr1D, arr1D.length);
		System.out.println(Arrays.toString(arr2));
		
		int[]arr3=Arrays.copyOf(arr1D, 7);
		System.out.println(Arrays.toString(arr3));
//		arr1D has 5things but when it put over 5, it comes with default value 0
		
		int[]arr4=Arrays.copyOfRange(arr1D, 2, 4);
//		if i want to get some part of value from arr1D not every value, use copyOfRange
		System.out.println(Arrays.toString(arr4));
		
		int[]arr5=Arrays.copyOfRange(arr1D, 0, 7);
//		copyOfRange range, from, to//it will copied from arr1D//from 0 to 7
		System.out.println(Arrays.toString(arr5));
	}

}
