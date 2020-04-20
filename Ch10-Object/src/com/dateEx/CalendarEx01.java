package com.dateEx;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		System.out.println(today);
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH)+1;
		int date=today.get(Calendar.DATE);
		
		System.out.println(year+"year"+month+"month"+date+"date");
		
		int day=today.get(Calendar.DAY_OF_WEEK);
//		it returns from 1 to 7
//		1 means sunday, 7 means saturday
		
		String nday="";
		System.out.println(day);
		
		switch(day) {
		case 1:	nday="monday"; break;
		case 2:	nday="tuesday";	break;
		}
		System.out.println(nday);	
		
		int AMPM=today.get(Calendar.AM_PM);
		String str_AMPM=(AMPM==Calendar.AM)?"am":"pm";
		System.out.println(str_AMPM);	
		
		int hour=today.get(Calendar.HOUR);
		int min=today.get(Calendar.MINUTE);
		int sec=today.get(Calendar.SECOND);
		
		System.out.println(hour+min+sec);
	}

}
