package com.phone;

// CellPhoneMain  main��                                                                    
// cellphone      �⺻���� �޴��� ���(�𵨸�, ��ǰ��ȣ, ���Ҹ��ڵ�)                             �θ�Ŭ����
// DicaPhone      ī�޶� ��ɸ� �߰�(ȭ��, ����), �⺻���� �ڵ��� ����� cellphone���� ��ӹ޾ƾ� ��        �ڽ�Ŭ����
// MP3Phone       ���� MP3��ɸ� �߰�(����뷮, ����)                                        �ڽ�Ŭ����


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
