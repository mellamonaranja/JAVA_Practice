class Number{
	public int num;
	
	public Number(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}


public class ArrayEx23 {

	public static void main(String[] args) {
		Number[] arr = new Number[] {new Number(2), new Number(4), new Number(6)};
			
		for(Number i:arr) {
			System.out.println(i.getNum());
		}
		
		for(Number i:arr) {
//			the reference of arr has saved to i
//			therefore i affected to Number[] arr
			i.num++;
			System.out.println(i.getNum());
		}
		
		for(Number i:arr) {
//			i is local variable
			
			i = new Number(8);
			i.num+=2;
			System.out.println(i.getNum());
		}
		
		for(Number i:arr) {
//			the reference of arr has saved to i
//			therefore i affected to Number[] arr
			i.num++;
			System.out.println(i.getNum());
		}
		
		}
		

	}


