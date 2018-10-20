package DateAPI_2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {

	public static void Age(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String dob = s.nextLine();
		String date = s.nextLine();
		
		displayAge(dob, date);
	}
	
	public static void displayAge(String dob, String date) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate d1 = LocalDate.parse(dob, df);
		LocalDate d2 = LocalDate.parse(date, df);
		Period diff = Period.between(d1, d2);
		
		int year = diff.getYears();
		int month = diff.getMonths();
		int day = diff.getDays();
		
		System.out.println("I am  " + year + " years, " 
									+ month + " months and " 
									+ day + " days old."
									);
	}

}
