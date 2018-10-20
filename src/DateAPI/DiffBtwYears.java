package DateAPI;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class DiffBtwYears {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String start = s.nextLine();
		String end = s.nextLine();
		
		DisplayDateDetails(start, end);

	}
	
	public static void DisplayDateDetails(String start, String end) {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate d1 = LocalDate.parse(start, format);
		LocalDate d2 = LocalDate.parse(end, format);

		Period interval = Period.between(d1, d2);
		System.out.println("Difference between " + d1.format(format).toString() + " and "
				+ d2.format(format).toString() + ": " + interval.getYears() + " Years and " +
				interval.getMonths() + " Months");
	}

}
