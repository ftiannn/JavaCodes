package DateAPI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class NameOfDay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String date = s.nextLine();
		displayDay(date);
	}
	
	
	public static void displayDay(String s) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date));
	}
}
