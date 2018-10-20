package DateAPI_2;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Time {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String date = s.nextLine();
		displayTime(date);
	}
	
	public static void displayTime(String date) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time = LocalTime.parse(date, df);
		time = time.plusHours(2);
		System.out.println(time);

	}

}
