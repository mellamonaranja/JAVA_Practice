
public class StringBuilderEx03 {

	public static void main(String[] args) {
		String str1=3+"java"+7;
//		has been created connected string implicitly
		System.out.println(str1);
		
		String str2=String.valueOf("3").concat("java").concat(String.valueOf("7"));
		System.out.println(str2);
//		it created new object newly whenever add new function
		
		String str3=new StringBuilder().append(3).append("java").append("7").toString();
//		for str3, only allows inherited string, but StringBuilder is belong to object
		System.out.println(str3);
//		once created object, it just added to object whenever add new functions
		
		

	}

}
