
public class StringEx03 {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		
		if(str1==str2) {
//			it just compare two string object's reference addresses
			System.out.println("str1==str2");
		}else {
			System.out.println("str1!=str2");
		}
		
		if(str1.equals(str2)) {
//			compare content method
			System.out.println("same content between str1 and str2");
		}else {
			System.out.println("isn't same content between str1 and str2");
		}
		

	}

}
