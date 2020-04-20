
public class StringEx07 {

	public static void main(String[] args) {
		String file1="HelloWorld.txt";
		boolean b1=file1.endsWith("txt");
//		test if this string ends with the specified suffix 
		System.out.println(b1);
		
		String file2="HelloWorld.db";
		boolean b2=file2.endsWith("txt");
		System.out.println(b2);
		
		String str1="Hello";
		boolean b3=str1.equals("Hello");
//		test if str1 is equals to ()
		System.out.println(b3);
		
		String str2="Hello";
		boolean b4=str2.equals("hello");
		System.out.println(b4);
		
		String str3="HelloWorld";
		boolean b5=str3.equals("Hello");
		System.out.println(b5);
		
		String str4="Hello World";
		boolean b6=str4.equals("Hello");
		System.out.println(b6);
		
		String str5="Everythings gonna be alright.";
		String str6=str5.toString();
		System.out.println(str5);
		System.out.println(str6);
		
		String str7=String.valueOf(true);
//		true is string type, doesn't mean true of true or false
		System.out.println(str7);
		
		String str8=String.valueOf('J');
//		J isn't character but string type
		System.out.println(str8);
		
		String str9=String.valueOf(10.0);
		System.out.println(str9);
		
		String str10=String.valueOf(100f);
//		f means real number
		System.out.println(str10);
		
		java.util.Date date=new java.util.Date();
		String str11=date.toString();
		System.out.println(str11);
		
		
	}

}
