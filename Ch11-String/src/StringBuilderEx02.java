class Adder{
	private int num;
	
	public Adder() {
		num=0;
	}
	
	public Adder add(int num) {
		this.num+=num;
		return this;
	}
	
	public void showResult() {
		System.out.println(num);
	}
}

public class StringBuilderEx02 {

	public static void main(String[] args) {
		Adder adder=new Adder();
		adder.add(1);
		adder.showResult();
		
		adder.add(7).add(1).showResult();
//		chained type
	}

}
