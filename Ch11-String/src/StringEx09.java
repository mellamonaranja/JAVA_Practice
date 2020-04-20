
public class StringEx09 {

	public static void main(String[] args) {
		
		String test="A|B|C|D";
		String[]result=test.split("\\|");
//		| has meaning, therefore it cannot be split unless use \\
		
		for(String s : result) {
			System.out.println(s);
		}

	}

}
