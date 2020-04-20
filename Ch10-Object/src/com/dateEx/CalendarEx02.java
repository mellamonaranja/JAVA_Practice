package com.dateEx;

import java.util.Calendar;

public class CalendarEx02 {

	public static void main(String[] args) {
		Calendar time=Calendar.getInstance();
//		create Calendar object
		
		System.out.println(time.getTime());
		
		time.add(Calendar.SECOND, 120);
		System.out.println(time.getTime());
		
		Calendar time1=Calendar.getInstance();
		Calendar time2=Calendar.getInstance();
		Calendar time3=Calendar.getInstance();
		
		System.out.println(time1.getTime());
		System.out.println(time2.getTime());
		System.out.println(time3.getTime());
		
		time2.set(1982, 12, 25);
		time3.set(2080, 12, 25);
		
		System.out.println(time1.before(time2));
//		is time1 before than time2?
		System.out.println(time1.after(time2));
//		is time1 after than time2?
		System.out.println(time1.before(time3));
		
		Calendar time4=Calendar.getInstance();
		time4.set(Calendar.YEAR, 2020);
		System.out.println(time4.getTime());
		
		time4.set(2080, 1, 25);
		System.out.println(time4.getTime());
//		January doesn't appear
	}

}
