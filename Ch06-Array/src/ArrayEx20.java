
public class ArrayEx20 {

	public static void main(String[] args) {
		
		String strName = "Hello World";
//		it is inherited object implicitly
//		string is saved character internally
		System.out.println(strName);
//		it printed with function toString automatically, so it isn't printed reference but string
//		because it happened overriding automatically
		
		char[] charName=strName.toCharArray();
//		return from string to character with using toCharArray
//		in order to do, need to initialize char
		System.out.println(charName);
		
		String strName2=new String(charName);
		System.out.println(strName2);
		
		char[]charArr= {'d', 'r', 'a', 'g', 'o', 'n'};
		System.out.println(changeToString(charArr));
//		to change char to string with using changeoString
		System.out.println(changeToString(charName));
		
	}

	public static String changeToString(char[] c) {
		System.out.println(c.length);
		return String.valueOf(c);
	}

}
