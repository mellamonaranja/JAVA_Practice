
public class StringEx02 {

	public static void main(String[] args) {
		
		String str1="My String";
//		once it created object, it creates reference address
//		created String type object implicitly
		String str2="Your String";
		String str3="My String";
//		before it creates object, it just refer previous one which has same reference address 
//		then if it is same reference address, it just returns reference address
		
		
		if(str1==str3) {
			System.out.println("str1==str3");
		}else {
			System.out.println("str1!=str3");
		}
		
		if(str2==str3) {
			System.out.println("str2==str3");
		}else {
			System.out.println("str2!=str3");
		}
		
		String str4=new String();
//		it created new object, means created new reference address
		if(str1==str4) {
			System.out.println("str1==str4");
		}else {
			System.out.println("str1!=str4");
		}

	}

}
