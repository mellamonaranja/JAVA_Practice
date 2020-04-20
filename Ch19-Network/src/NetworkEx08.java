import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class NetworkEx08 {

	public static void main(String[] args) {

		URL url = null;
		URLConnection uc = null;
		
		try {
			url = new URL("http://www.naver.com");
			
			uc = url.openConnection();
			
			uc.connect();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("uc: " + uc.toString());
		
		System.out.println("Interaction: " + uc.getAllowUserInteraction());
		
		try {
			System.out.println("content: " + uc.getContent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("encoding: " + uc.getContentEncoding());
		
		System.out.println("length: " + uc.getContentLength());
		
		System.out.println("type: " + uc.getContentType());
		
		System.out.println("date: " + uc.getDate());
		
		System.out.println("date(Date): " + new Date(uc.getDate()));
		
		
	}

}
