package DateAPI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class displayDateTime {
	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String in this format(YYYY-MM-DD HH:mm:ss)");
		String date = sc.nextLine();
		displayDT(date);
	}
	
	public static void displayDT(String input) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sf.parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("dd/MM/yyyy, H:mm:ss").format(date));
	}
}