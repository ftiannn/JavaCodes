package DateAPI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BeforeAndAfter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String date = s.nextLine();
		displayDateDetails(date);
	}
	
	public static void displayDateDetails(String s) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate localDate = LocalDate.parse (s , format);
		LocalDate yearLater = localDate.plusYears(1);
		LocalDate yearBefore = localDate.minusYears(1);
		System.out.println(yearLater);
		System.out.println(yearBefore);
	}
}
