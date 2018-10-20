
package DateAPI;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DayOfMonth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		int month = s.nextInt();
		displayDay(year, month);
	}
	
	public static void displayDay(int year, int month ) {
		YearMonth yearMonth = YearMonth.of(year, month);  // January of 2015.
		LocalDate first = yearMonth.atDay(1);
		LocalDate last = yearMonth.atEndOfMonth();

		System.out.println(first.getDayOfWeek().toString());
		System.out.println(last.getDayOfWeek().toString());
	}
}
