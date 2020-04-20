// 객체 : tv
// 변수(데이터, 속성) : 전원유무, 채널
// 메소드(기능,행위) : 전원on/off, 채널 증가, 감소
// 클래스는 public class의 위/아래 어디서 만들든지 상관 없음

class tv{
	boolean power;
//	boolean의 기본 값은 false가 됨
	int channel;

public void power() {
	power=!power;
}
//	toggle 기능(껐다 켰다 하는 기능)
	
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
		System.out.println("Tv 실행 유무" + tv.power);
		tv.power();
		System.out.println("Tv 실행 유무" + tv.power);
		System.out.println("현재 채널" + tv.channel);
		
		tv.channel=7;
		System.out.println("변경된 채널" + tv.channel);
		
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("변경된 채널" + tv.channel);
		
		tv.channelDown();
		System.out.println("변경된 채널" + tv.channel);
		
		tv.power();
		System.out.println("Tv 실행 유무" + tv.power);
	}

}
