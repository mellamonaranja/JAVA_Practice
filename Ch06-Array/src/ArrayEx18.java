import java.util.Arrays;
public class ArrayEx18 {

	public static void main(String[] args) {
		int [] i= 
			{-1, 0, 299, 2, 956, 0, 9, -900};
		
		System.out.println(Arrays.toString(i));
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		//basic setting is starts from small value
		
		reverseArraysInt(i);	
//		in order to organize from bigger to smaller
//		need to make another
		System.out.println(Arrays.toString(i));
}

	public static void reverseArraysInt(int[] array) {
		
		int temp;
		for(int i=0;i<array.length/2;i++) {
//			there is 8 indexes in total, exchange from the smallest to the biggest, second small to second big, so it will be counted only 4times.
//			the value 0 in the index need to be stored in temp
//			
			
			temp=array[i];
			array[i]=array[(array.length-1)-i];
//			index value 7th, it means -1 from array.length
//			ex) array[0] is array[7], and array[0] will be 956 //in order to print reverse value
			
//			more go right from left, the value of index from right needs to to left therefore put -1
			
			array[(array.length-1)]=temp;
			
			
		}
			
	}
	
	
}


