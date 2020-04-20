
public class StaticEx02 {

	String s1="instance variable";
//	member variable and instance variable
//	accessible with creating an object
	static String s2="static variable";
//	regardless of creating an object, it calls class variable
	
	public static String getString() {
//		return s1;
//		cannot make a static reference to the non-statkc field s1
		
//		static method
//		the name of getString will be StaticEx02.getString
		return s2;
	}
	
	public static void main(String[] args) {
		StaticEx02 sc=new StaticEx02();
		System.out.println(sc.s1);
		
		System.out.println(StaticEx02.s2);
		System.out.println(StaticEx02.getString());
	}

}
