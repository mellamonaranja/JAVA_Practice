package com.mathex;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		String[]luck=  {"�ζ� ��÷", "�����Ϸ� ����", "�����ο� �Ϸ�", 
				"��ſ� ����", "�׳ɱ׳�", "������ �ִ� �Ϸ�"};
		
		Random random=new Random();
//		in order to use random method, need to import from java.util.Random;
		
		int i= random.nextInt(6);
//		need the value from 0 to 5 in index
		System.out.println(i);
		
		System.out.println(luck[i]);
	}

}
