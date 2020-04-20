
public class StringEx05 {

	public static void main(String[] args) {
		String name="Hong Gil Dong";
		
		int index=name.indexOf('n');
//		index numbering starts from 0 to 12 about Hong Gil Dong
//		it returns the first placed index
		System.out.println(index);
		
		index=name.indexOf('z');
		System.out.println(index);
//		it returns -1 when the value looking for doesn't match
		
		index=name.indexOf("Gil");
		System.out.println(index);
//		it returns the first index which in place "Gil"
//		if search more detail, use this way(if there is many G)
		
		index=name.indexOf("Gilo");
		System.out.println(index);
//		it returns -1 when the value looking for doesn't match
		
		index=name.lastIndexOf('n');
//		it returns the last placed index
		System.out.println(index);
		
		char ch=name.charAt(index);
		System.out.println(ch);
		
		index=name.indexOf('G');
		System.out.println(index);
		
		String str=name.substring(index);
//		extracts the string to its end
		System.out.println(str);
		
		str=name.substring(index, index+3);
//		extracts from start index to 3th index
		System.out.println(str);
//		it doesn't include vacancy(space bar, empty character)
		
		int length=name.length();
		System.out.println(length);
		
		String[]arr=name.split(" ");
//		split the string
//		it returns with string array type, therefore need to change the type to String[]
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr [" + i + "]: "+arr[i]);
		}
		
	}

}
