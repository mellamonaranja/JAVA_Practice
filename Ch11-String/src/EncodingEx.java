import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingEx {

	public static void main(String[] args) {
		String[]types= {"UTF-8", "EUC-KR", "ISO-8859-1"};
		String testValue="ÇÑ±Û";
		
		System.out.println(testValue);
		
		String result1=null;
		String result2=null;
		
		try {
			for(String type1:types) {
				
				result1=URLEncoder.encode(testValue,type1);
				System.out.println(type1+result1);
				
				for(String type2:types) {
					result2=URLDecoder.decode(result1,type2);
					System.out.println(type2+result2);
				}
				System.out.println('/');
			}
//			if there is occured problem
			
		}catch(UnsupportedEncodingException e) {
//			catch and make it as exception case
			e.printStackTrace();
		}

	}

}
