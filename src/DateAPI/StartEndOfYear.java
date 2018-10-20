package DateAPI;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class StartEndOfYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = s.nextInt();
		displayDay(year);
	}
	
	public static void displayDay(int year) {
		LocalDate date = LocalDate.of(year, Month.JANUARY,01);
	    LocalDate firstDayOfYear = date.with(TemporalAdjusters.firstDayOfYear());
	    LocalDate lastDayOfYear = date.with(TemporalAdjusters.lastDayOfYear());
	    
	    String first = firstDayOfYear.getDayOfWeek().toString().substring(0,3);
	    String s1 = first.substring(1, 3).toLowerCase();
	    String firstDay = first.substring(0,1) + s1;

	    String last = lastDayOfYear.getDayOfWeek().toString().substring(0,3);
	    String s2 = last.substring(1, 3).toLowerCase();
	    String lastDay = last.substring(0,1) + s2;
	    
		System.out.println("Start Day of the given year is " + firstDay);
		System.out.println("End Day of the given year is " + lastDay);
	}
}