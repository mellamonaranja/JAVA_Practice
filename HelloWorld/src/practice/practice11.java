package practice;

import java.util.Calendar;
import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println("input the year and month");
		System.out.println("year>");
		int year = input.nextInt();

		System.out.println("month>");
		int month = input.nextInt();

		System.out.println("\n[" + month + "/" + year + "]");
		System.out.println("    Sun    Mon    Tue    Wed    Thu    Fri    Sat");

		cal.set(year, month - 1, 1);

		int lastofDate = cal.getActualMaximum(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < week; i++) {
			System.out.print("       ");
		}

		for (int i = 1; i <= lastofDate; i++) {
			System.out.print((i < 10) ? "      " + i : "     " + i);

			if (week % 7 == 0)
				System.out.println();
			week++;

		}
		input.close();
	}

}
