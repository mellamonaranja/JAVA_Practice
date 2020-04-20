package com.phone;

// CellPhoneMain  main부                                                                    
// cellphone      기본적인 휴대폰 기능(모델명, 제품번호, 벨소리코드)                             부모클래스
// DicaPhone      카메라 기능만 추가(화소, 렌즈), 기본적인 핸드폰 기능은 cellphone에서 상속받아야 함        자식클래스
// MP3Phone       오직 MP3기능만 추가(저장용량, 색상)                                        자식클래스


public class CellPhoneMain {

	public static void main(String[] args) {

		DicaPhone dica = new DicaPhone("a1001", "n1001", "f1.8", "800pixs", 1001);
		MP3Phone mp3 = new MP3Phone("b1001\t", "m1001\t", "2001\t", "1024\t", 2001);
		System.out.print(dica.getModel());
		System.out.print(dica.getNumber());
		System.out.print(dica.getBellsound());
		System.out.print(dica.getLens());
	}

}
