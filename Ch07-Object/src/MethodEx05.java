// call by reference
public class MethodEx05 {
	
	public void increase(int[]n) {
//		array[]is an object, array is belong to an object
//		[]array is same as n
//		n is same as ref below
		
		System.out.println(n);
		
		for(int i=0;i<n.length;i++) {
			n[i]++;
		}
	}

	public static void main(String[] args) {
		int ref[]= {100,200,300};
//		ref is same as n upper
		for(int i=0;i<ref.length;i++) {
			System.out.println(ref[i]);		
		}
		System.out.println(ref);
//		ref is both of name of array and variable
		
		MethodEx05 me=new MethodEx05();
		System.out.println(me);
		me.increase(ref);

	}

}
