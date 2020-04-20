import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkEx07 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.hrd.go.kr/");
		
		HttpURLConnection conn = 
				(HttpURLConnection)
				url.openConnection();
		
		conn.setDoInput(true);
		conn.setDoOutput(true);
		
		conn.setUseCaches(false);
		conn.setReadTimeout(20000);
//		conn.setRequestMethod("GET");
		conn.setRequestMethod("POST");
		
		StringBuffer stringBuffer = new StringBuffer();
		
		BufferedReader br =
				new BufferedReader(
						new InputStreamReader(
								conn.getInputStream(), "UTF-8"));
		
		for(;;) {
			String line = br.readLine();
			
			if(line==null) {
				break;
			}
			
			stringBuffer.append(line+"\n");
			
		}
		
		br.close();
		conn.disconnect();
		
		
		System.out.println(stringBuffer.toString());
		
		
	}

}
