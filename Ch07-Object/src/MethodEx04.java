// call by value
public class MethodEx04 {

	public int increase(int v) {
		++v;
		
		return v;
	}
	
	public static void main(String[] args) {
		MethodEx04 me = new MethodEx04();
		
		int var1=100;
//		call by value, copied cup only, so if this value is change, it does'nt affect
		int var2=me.increase(100);
		
		System.out.println(var1);		
		System.out.println(var2);
		
	}

}
