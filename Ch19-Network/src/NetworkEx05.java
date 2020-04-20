import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx05 {

	public static void main(String[] args) {

		try {
			URL url = 
					new URL("http://java.sun.com/index.jsp?name=hongjildong#content");
			
			System.out.println("��������: " + url.getProtocol());
			System.out.println("ȣ��Ʈ��: " + url.getHost());
			
			System.out.println("��Ʈ��ȣ: " + url.getPort());
			System.out.println("default ��Ʈ��ȣ:" + url.getDefaultPort());
			
			System.out.println("�н�:" + url.getPath());
			System.out.println("��û�� �����ڿ� ����:" + url.getFile());
			System.out.println("����: " + url.getQuery());
			System.out.println("���۷���: " + url.getRef());
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
