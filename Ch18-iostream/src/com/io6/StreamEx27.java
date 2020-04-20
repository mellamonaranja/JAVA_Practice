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
		
		out.printf("올해는 %d 년도 입니다.", 2019);
		out.println();
		out.println("미래는 많은 이름을 갖고 있습니다.\n\n\n");
		out.println("약한 자에게는 \'도달할 수 없는 것\'");
		out.println("두려워하는 자에게는 \'알려지지 않는 것\'");
		out.println("용감한 자에게는 \'기회\'");
		out.println("당신의 꿈에 올인하세요!");
		
		out.close();
	}

}
