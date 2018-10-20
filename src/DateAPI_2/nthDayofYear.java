package DateAPI_2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class nthDayofYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		int day = s.nextInt();
		displayDate(year, day);
	}
	
	public static void displayDate(int year, int day) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate d = LocalDate.of(year,01,01);
		LocalDate d1 = d.plusDays(day-1);
		
		System.out.println(day+"th day of " + year + " : " + d1.format(df));
 
	}

}
