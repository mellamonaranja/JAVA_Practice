import java.util.StringTokenizer;

public class StringTokenizerEx03 {

	StringTokenizer str1;
	
	public StringTokenizerEx03(String str) {
		System.out.println(str);
		
		str1=new StringTokenizer(str);
	}
	
	public StringTokenizerEx03(String str, String delim) {
		System.out.println(str);
		
		str1=new StringTokenizer(str, delim);
		
	}
	
	public void print() {
		System.out.println(str1.countTokens());
		System.out.println("splited string");
		
		while(str1.hasMoreTokens()) {
//			the standard of count token is gap of space bar
			String str2=str1.nextToken();
			System.out.println(str2);
		}
	}
	
	
	public static void main(String[] args) {
		StringTokenizerEx03 stringtokenizer03=new StringTokenizerEx03("Merry Christmas !!!");
		stringtokenizer03.print();
		
		StringTokenizerEx03 stringtokenizer04=new StringTokenizerEx03("2020/12/25", "/");
//		distinguished "" with /
		stringtokenizer04.print();
	}

}
