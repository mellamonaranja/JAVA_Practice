package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	
	public static void main(String[] args) {
		
		Date now=new Date();
		System.out.println(now);
		
		System.out.println(now.toLocaleString());
//		make in a row with Korean type with now.toLocaleString()
		System.out.println(now.toGMTString());
//		make in a row with greenwich mean time
		
		SimpleDateFormat simpledateformat=new SimpleDateFormat("yyyy년 mm월 dd일 E요일 a hh시 mm분 ss초");
		String today=simpledateformat.format(now);
		System.out.println(today);
//		format has been changed from <<Wed Nov 13 14:44:28 KST 2019>> to <<"yyyy mm dd E a hh mm ss">>
		
	}

}
