import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		String str1="100,200,300,400,500";
//		stored with cvs type which has ,
		
		StringTokenizer stringtokenizer = new StringTokenizer(str1, ",");
		
		while(stringtokenizer.hasMoreTokens()) {
//			test if there are more tokens available from this tokenizer's string
			System.out.println(stringtokenizer.nextToken());
//			return the next token from this string tokenizer
		}
//		stringtokenizer.nextToken();

	}

}
