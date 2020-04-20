import java.util.Arrays;

public class ArrayEx13 {

	public static void main(String[] args) {
		
		String[]arrStr1D=new String[] 
				{"code","dragon"};
		
		String[]arrStr2D=new String[] 
				{"code","dragon"};
		
		System.out.println(arrStr1D);
		System.out.println(arrStr2D);
//		they have different references each
//		then how can compare with them? importing java.util.Arrays
		
		
		if(arrStr1D==arrStr2D) {
			System.out.println("Two arrays are same.");
		}else {
			System.out.println("Two arrays aren't same.");
		}
//		they aren't same because array is an object
//		code, dragon is made in memory, the reference is input to arrStr1D,arrStr2D
		
		System.out.println("equals"+Arrays.equals(arrStr1D, arrStr2D));
//		this is the function compare to the content each
		
		System.out.println("equals"+Arrays.deepEquals(arrStr1D, arrStr2D));
//		if deepEquals is used in 1th dimension, the result is same as 2th dimension
		
		String[][]arrStr2D1=new String[][] {
			{"code","dragon"},
			{"CODE","DRAGON"}
		};
		String[][]arrStr2D2=new String[][] {
			{"code","dragon"},
			{"CODE","DRAGON"}
		};
		
		System.out.println("equals"+Arrays.deepEquals(arrStr2D1, arrStr2D2));
//		arrStr2D1, arrStr2D2 are multiple arrays, so it needs to deepToString in order to print
	}

}
