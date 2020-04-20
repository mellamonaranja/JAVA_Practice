import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx05 {

	public static void main(String[] args) {

		try {
			URL url = 
					new URL("http://java.sun.com/index.jsp?name=hongjildong#content");
			
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트명: " + url.getHost());
			
			System.out.println("포트번호: " + url.getPort());
			System.out.println("default 포트번호:" + url.getDefaultPort());
			
			System.out.println("패스:" + url.getPath());
			System.out.println("요청한 파일자원 정보:" + url.getFile());
			System.out.println("쿼리: " + url.getQuery());
			System.out.println("레퍼런스: " + url.getRef());
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
