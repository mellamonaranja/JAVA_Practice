
public class StringBufferEx02 {

	public static void main(String[] args) {
		StringBuffer stringbuffer=new StringBuffer("자바 정말 쉽다?!");
		System.out.println(stringbuffer);
		
		stringbuffer.insert(2,"is");
		System.out.println(stringbuffer);
		
		stringbuffer.append("파이썬은").append(" 재미있다.");
		System.out.println(stringbuffer);
		
		stringbuffer.replace(0,3,"android");
//		replace from index 0 to index 3th with ""
		System.out.println(stringbuffer);
		
		stringbuffer.delete(0, 8);
		System.out.println(stringbuffer);
//		variable type string
		
		String str=stringbuffer.toString();
		System.out.println(str);
//		string type string<--recommendable
		
		StringBuffer stringbuffer1=new StringBuffer("java python");
		System.out.println(stringbuffer1);
//		stringbuffer1.deleteCharAt(4);
//		the method delete one character from index
		System.out.println(stringbuffer1.deleteCharAt(4));
		
		StringBuffer stringbuffer2=new StringBuffer("code dragon");
		System.out.println(stringbuffer2);
		System.out.println(stringbuffer2.reverse());
//		reverse the sequence
	}

}
