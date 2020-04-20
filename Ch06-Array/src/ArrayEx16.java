import java.util.Arrays;
public class ArrayEx16 {

	public static void main(String[] args) {
		String[] s=
			{"bbb", "AAA", "TTT", "mmm", "DDD", "CCC", "aaa"};
				
				System.out.println(Arrays.toString(s));
				Arrays.sort(s);
				System.out.println(Arrays.toString(s));
				
				Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
//				the basic setting is sensitive which is printed upper character first
//				CASE_INSENSITIVE_ORDER means printed every alphabet with in order distinguishing with upper and lower character
//				in order to organize upper character first, using String.CASE_INSENSITIVE_ORDER
		}
		

	}


