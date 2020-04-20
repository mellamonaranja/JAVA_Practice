
public class StringEx04 {

	public static void main(String[] args) {
		String str1="Java"+"Love";
//		it happened connection calculator
		System.out.println(str1);
		
		String str11="Java".concat("Love");	
//		abbreviated concatenate
		System.out.println(str11);
		
		String str2="Java"+'A';
		String str22="Java".concat(String.valueOf('A'));
//		concatenate only allows string type"", not character, int''
//		in order to change, inserted String.valueOf
		
		String str3="Java"+3;
		String str33="Java".concat(String.valueOf(3));
//		int type 3 has been changed to string type
		
		String str4=3+"Java"+7;
		String str44="".concat(String.valueOf(3)).concat("Java").concat(String.valueOf(7));
//		chained type
		
		str4+='!';
		System.out.println(str4);
	}

}
