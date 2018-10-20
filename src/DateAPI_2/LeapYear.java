package DateAPI_2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = s.nextInt();
		displayYear(year);
	}
	
	public static void displayYear(int year) {
		LocalDate d = LocalDate.of(year,1,1);
		boolean isleap = d.isLeapYear();
		
		if (isleap == true) {
			System.out.println(year + " is leap year");
		}
		
		else {
			System.out.println(year + " is not leap year");
		}
	}

}
