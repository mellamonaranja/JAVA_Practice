import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class NetworkEx03 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = null;
		
		String url = null;
		
		InetAddress[] addresses;
		
		
		br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		System.out.println("웹사이트 주소 입력 > ");
		url = br.readLine();
		
		addresses = InetAddress.getAllByName(url);
		
		for(int i=0; i < addresses.length ; i++) {
			System.out.println(addresses[i]);
			
		}
		
		System.out.println("Local computer's IP: ");
		System.out.println(InetAddress.getLocalHost());
		
		
		br.close();
		
	}

}
