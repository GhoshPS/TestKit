package TestNG;

import java.time.LocalDate;

public class DateLocal {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate previousDate = date.minusDays(1);
		LocalDate upcomingDate = previousDate.plusDays(2);
		System.out.println("Today date :" + date);
		System.out.println("Prevoius date " + previousDate);
		System.out.println("Upcoming date " + upcomingDate);
	}

}
