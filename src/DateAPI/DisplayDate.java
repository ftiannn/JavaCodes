package DateAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DisplayDate {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		
		
			try {
				Date d = new SimpleDateFormat("MMM dd, yyyy").parse(date);
				System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(d));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
