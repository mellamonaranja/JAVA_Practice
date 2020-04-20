
public class ArrayEx19 {

	public static void main(String[] args) {
		String[] programlist= new String[3];
//		the reference has stored in programlist
		char[]charr= {'P', 'y', 't', 'h', 'o', 'n'};
		String str1="Python";
		String str2=new String("Python");
		

		programlist[0] = "Java";
		programlist[1] = "R";
		programlist[2] = new String(charr);
		System.out.println(programlist[2]);
		
//		for(variable to save the subject:subject) {
		for(String e:programlist) {	
			System.out.println(e);
		}
		
		for(char i:charr) {
			System.out.println(i);
		}
	}

}
