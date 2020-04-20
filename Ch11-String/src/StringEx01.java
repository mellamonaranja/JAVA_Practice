
public class StringEx01 {

	public static void main(String[] args) {
		java.lang.String str="String instance";
		System.out.println(str);
//		it calls toString internally
//		it handled string internally

		int strLength1=str.length();
		System.out.println(strLength1);
		
		int strLength2="한글의 길이는 어떻게?".length();
//		with "" can be create string object
//		get result to Korean character's length
		System.out.println(strLength2);		

	}

}
