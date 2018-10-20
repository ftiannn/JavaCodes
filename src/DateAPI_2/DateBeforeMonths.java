package DateAPI_2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class DateBeforeMonths {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String date = s.nextLine();
		displayDate(date);
	}
	
	public static void displayDate(String date) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate d = LocalDate.parse(date, df);
		LocalDate d1 = d.minusMonths(20);
				
		System.out.println("20 months before " + date + " will be " + d1.format(df));
	}
	


}
