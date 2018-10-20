package DateAPI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DayOfYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String date = s.nextLine();
		displayDay(date);
	}
	
	public static void displayDay(String s) {
		
		/*
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate date = LocalDate.parse(s, df);
		System.out.println("Day of year : " + date.getDayOfYear());
		 */
		
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sf.parse(s);
			LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			
			int dayOfYear = localDate.getDayOfYear();
			System.out.println("Day of year : "+ dayOfYear);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}