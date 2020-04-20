import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx01 {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		
		OutputStream outputStream = null;
		PrintStream printStream = null;
		
		
		try {
			serverSocket = new ServerSocket(8989);
			
			System.out.println("Server waitting");
			
			socket = serverSocket.accept();
			
			outputStream = socket.getOutputStream();
			printStream = new PrintStream(outputStream);
			
			printStream.println("Hello, Server connected");
			
			printStream.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(printStream!=null) {
					printStream.close();
				}
				
				if(outputStream!=null) {
					outputStream.close();
				}
				
				if(socket!=null) {
					socket.close();
				}
				
				if(serverSocket!=null) {
					serverSocket.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Sever disconnected");
		} // finally
	}

}
