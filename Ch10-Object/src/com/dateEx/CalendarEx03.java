package com.dateEx;

import java.util.Scanner;

public class CalendarEx03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month : ");
		int inputMonth = input.nextInt();
		int firstDay = 7;

		int daysMonth = 0;
		String monthDisplay = "";

		switch (inputMonth) {
		case 1:
			monthDisplay = "January";
			daysMonth = 31;
			break;

		case 2:
			monthDisplay = "February";
			daysMonth = 28;
			break;

		case 3:
			monthDisplay = "March";
			daysMonth = 31;
			break;

		case 4:
			monthDisplay = "April";
			daysMonth = 30;
			break;

		case 5:
			monthDisplay = "May";
			daysMonth = 31;
			break;

		case 6:
			monthDisplay = "June";
			daysMonth = 30;
			break;

		case 7:
			monthDisplay = "July";
			daysMonth = 31;
			break;

		case 8:
			monthDisplay = "August";
			daysMonth = 31;
			break;

		case 9:
			monthDisplay = "September";
			daysMonth = 30;
			break;

		case 10:
			monthDisplay = "October";
			daysMonth = 31;
			break;

		case 11:
			monthDisplay = "November";
			daysMonth = 30;
			break;

		case 12:
			monthDisplay = "December";
			daysMonth = 31;
			break;

		default:
			System.out.println("Input validated");
		}
		
		if(daysMonth>0) {
			System.out.println("Sun     Mon     Tue     Wed     Thu     Fri     Sat");
			
			for (int daysDisplay = 1; daysDisplay <= daysMonth; daysDisplay++) {
				System.out.printf("%3d      ", daysDisplay);
				if (daysDisplay % 7 == 0)
					System.out.println();
			}
		}
	}
}