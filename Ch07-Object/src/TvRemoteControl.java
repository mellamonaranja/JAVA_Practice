// ��ü : tv
// ����(������, �Ӽ�) : ��������, ä��
// �޼ҵ�(���,����) : ����on/off, ä�� ����, ����
// Ŭ������ public class�� ��/�Ʒ� ��� ������� ��� ����

class tv{
	boolean power;
//	boolean�� �⺻ ���� false�� ��
	int channel;

public void power() {
	power=!power;
}
//	toggle ���(���� �״� �ϴ� ���)
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
}
}

public class TvRemoteControl {

	public static void main(String[] args) {
		
		tv tv = new tv();
		System.out.println("Tv ���� ����" + tv.power);
		tv.power();
		System.out.println("Tv ���� ����" + tv.power);
		System.out.println("���� ä��" + tv.channel);
		
		tv.channel=7;
		System.out.println("����� ä��" + tv.channel);
		
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("����� ä��" + tv.channel);
		
		tv.channelDown();
		System.out.println("����� ä��" + tv.channel);
		
		tv.power();
		System.out.println("Tv ���� ����" + tv.power);
	}

}
