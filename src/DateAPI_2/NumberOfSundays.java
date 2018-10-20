package DateAPI_2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;


public class NumberOfSundays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String date1 = s.nextLine();
		String date2 = s.nextLine();
		displayDate(date1,date2);
	}
	
	public static void displayDate(String date1, String date2) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-d");
		LocalDate start = LocalDate.parse(date1, df);
		LocalDate end = LocalDate.parse(date2, df);
		
		LocalDate firstSun = start.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		
		if (start.isAfter(firstSun)) {
			start = firstSun.plusWeeks(1);
		} else {
			start = firstSun;
		}
		
		int count = 0;
		while (start.isBefore(end)) {
			count++;
			start = start.plusWeeks(1);
		}
		
		System.out.println(count);

	}
}
