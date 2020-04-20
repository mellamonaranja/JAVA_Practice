
public class StringEx08 {

	public static void main(String[] args) {
		String str=new String("abcde");
		System.out.println(str);

		System.out.println(str.compareTo("bcefg"));
		System.out.println(str.compareTo("abcde"));
		System.out.println(str.compareTo("ABCDE"));
//		compare with aschii code value and returns the gap
//		a is 33 A is 65
		System.out.println(str.compareToIgnoreCase("ABCDE"));
//		it compare with two strings ignoring case differences
	}

}
