import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {

		String str1="2019-11-14 15:42:48";
		StringTokenizer stringtokenizer1=new StringTokenizer(str1, "-: ");
		while(stringtokenizer1.hasMoreTokens()) {
//			test if there are more tokens available from this tokenizer's string
			System.out.println(stringtokenizer1.nextToken());
//			returns the next token from this tokenizer's string
			
		}
	}

}
