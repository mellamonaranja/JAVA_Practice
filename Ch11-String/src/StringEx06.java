
public class StringEx06 {

	public static void main(String[] args) {
		String str1="  aaaaabbAAABB  ";
		System.out.println(str1);
		
		String str2=null;
		System.out.println(str2);
//		string object initialized
		
		String str3=" ";
//		it called by white space especially before or later of string, 
		System.out.println(str3);
		
		str3=str1.replace("aa", "b");
//		change the character aa of str1 to non-visible
		System.out.println(str3);
		
		str2=str1.toUpperCase();
//		do change str1's string to uppercase
		System.out.println(str2);
		
		str2=str1.toLowerCase();
		System.out.println(str2);
		
		str2=str1.trim();
//		remove the vacancy
		System.out.println(str2);
		
		boolean check1=str1.contains("aa");
//		is there "aa"? if so, returns true otherwise false
//		contains method is accompanied with boolean 
		System.out.println(check1);
		
		boolean check2=str1.contains("xxx");
		System.out.println(check2);
		
		String before="there are two ways of streading light;";
		String after=" to be candle or the mirror that reflects it.";
		String result=before.concat(after);
		System.out.println(result);
		
	}

}
