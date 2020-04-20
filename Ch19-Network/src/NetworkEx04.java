import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkEx04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		InetAddress[] inetAddress = null;
		
		System.out.println("URL 주소를 입력하세요 > ");
		
		String str = scanner.nextLine();
		
		
		try {
			inetAddress = InetAddress.getAllByName(str);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<inetAddress.length ; i++) {
			System.out.println("getHostName: " + inetAddress[i].getHostName());
			System.out.println("getHostAddress: " + inetAddress[i].getHostAddress());
			System.out.println("toString: " + inetAddress[i].toString());
			System.out.println("------------------------");
			
		}
		
		
		scanner.close();
		
	}

}
