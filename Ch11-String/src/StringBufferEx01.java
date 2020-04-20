
public class StringBufferEx01 {

	public static void main(String[] args) {
		StringBuffer stringbuffer = new StringBuffer("Code");
		StringBuffer str1=stringbuffer.append("dragon");
		
		String str2=null;
		
		if(stringbuffer==str1) {
			str2="stringbuffer==str1";
		}else {
			str2="stringbuffer!=str1";
		}
		System.out.println(str2);
		
		System.out.println(stringbuffer);
		System.out.println(str1);
		
		

		
				

	}

}
