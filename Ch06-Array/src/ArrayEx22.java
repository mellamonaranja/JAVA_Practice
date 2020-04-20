class Num{
	public int num;
	public Num(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
}


public class ArrayEx22 {

	public static void main(String[] args) {

		Num[] arr = new Num[3];
//		arr is object of Num class
		arr[0]=new Num(10);
//		inside [] allows only objects of Num class
		arr[1]=new Num(20);
		arr[2]=new Num(30);
		
		for(Num i:arr) {
			System.out.println(i.getNum());
			System.out.println(i);
//			with the value of reference i, can approach to the object
//			therefore, i is able to approach to getNum
		}
		
	}

}
