import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class NetworkEx02 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		String url = null;
		
		InetAddress address = null;
		
		
		try {
			br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("������Ʈ �ּ� �Է� >");
			
			url = br.readLine();
			
			address = InetAddress.getByName(url);
			
			System.out.println("ȣ��Ʈ �̸�: " + address.getHostName());
			System.out.println("ȣ��Ʈ �ּ�: " + address.getHostAddress());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
	}

}
