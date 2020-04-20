import java.io.IOException;
import java.net.ServerSocket;

public class NetworkEx01 {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		
		
		for(int i=1; i<=65535 ; i++) {
			
			try {
				serverSocket = new ServerSocket(i);
				serverSocket.close();
				
			} catch (IOException e) {
				
				System.out.println(i+"번 TCP Port가 열려있습니다.");
				
			}
		}
		
	}

}
