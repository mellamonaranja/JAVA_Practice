import java.util.Vector;

public class GenericsEx01 {

	public static void main(String[] args) {
		Vector<String> gen=new Vector<String>();
//		declare <> when create the object
//		declare the use of Vector to put the String
		
		gen.add("korea");
		gen.add("korea");
		System.out.println(gen.size());
//		get result to size of index
		
		String tmp;
		
		for(int i=0;i<gen.size();i++) {
			tmp=gen.get(i);
			System.out.println(tmp);
		}
		
		for(String str:gen) {
			System.out.println(str);
		}
		
		

	}
}