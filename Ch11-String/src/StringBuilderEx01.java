
public class StringBuilderEx01 {

	public static void main(String[] args) {
		StringBuilder stringbuilder = new StringBuilder("orange");
		System.out.println(stringbuilder);
		
		stringbuilder.append(27);
		System.out.println(stringbuilder);
		
		stringbuilder.append('j').append(true);
		System.out.println(stringbuilder);
		
		stringbuilder.insert(9, "ava");
		System.out.println(stringbuilder);
		
		stringbuilder.insert(stringbuilder.length(), 'z');
//		this way is same as append 
		System.out.println(stringbuilder);
		
		String str1=stringbuilder.toString();
//		recommendable
		System.out.println(stringbuilder);
	}

}
