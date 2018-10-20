package DateAPI_2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayBeforeAndAfter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String date = s.nextLine();
		displayDay(date);
	}
	
	public static void displayDay(String date) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate d = LocalDate.parse(date, df);
		
		LocalDate prev = d.minusDays(10);
		String prevDay = prev.getDayOfWeek().toString();
		System.out.println(prev + "\n" + prevDay.substring(0,1) + prevDay.substring(1,prevDay.length()).toLowerCase());
		
		LocalDate next = d.plusDays(10);
		String nextDay = next.getDayOfWeek().toString();
		System.out.println(next + "\n" + nextDay.substring(0,1) + nextDay.substring(1,nextDay.length()).toLowerCase());
		

	}

}
