package com.io6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamEx27 {

	public static void main(String[] args) throws Exception {

		PrintWriter out =
				new PrintWriter(
						new FileWriter("printwriter.txt")
						);
		
		out.printf("���ش� %d �⵵ �Դϴ�.", 2019);
		out.println();
		out.println("�̷��� ���� �̸��� ���� �ֽ��ϴ�.\n\n\n");
		out.println("���� �ڿ��Դ� \'������ �� ���� ��\'");
		out.println("�η����ϴ� �ڿ��Դ� \'�˷����� �ʴ� ��\'");
		out.println("�밨�� �ڿ��Դ� \'��ȸ\'");
		out.println("����� �޿� �����ϼ���!");
		
		out.close();
	}

}
