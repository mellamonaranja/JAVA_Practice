import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx06 {

	public static void main(String[] args) {
		
		String address = "http://www.tjoeun.co.kr/index.html";
		
		URL url = null;
		BufferedReader input = null;
		String line = "";
		
		try {
			url = new URL(address);
			
			InputStream in = url.openStream();
			
			
			input = new BufferedReader(
					new InputStreamReader(in));
			
			
			while( (line = input.readLine()) !=null ){
				System.out.println(line);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
