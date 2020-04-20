import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx04 {

	public void printData() throws IOException{
		BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input> ");
		
		int dan=Integer.parseInt(bufferedreader.readLine());
//		readLine accompanies IOException
//		IOException threw to up there
		
		System.out.println(dan + "´Ü");
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan + i + dan*i);
		}
	}
		
	public static void main(String[] args) {
		
		ExceptionEx04 exceptionex04=new ExceptionEx04();
		
		
		try {
			exceptionex04.printData();	
			
		}catch(Exception e) {
			System.out.println("error");
			

		
		}

	}

}
