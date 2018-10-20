package validation;
import java.util.Scanner;
import java.lang.String;

public class validation1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String date = sc.nextLine();
			UserMainCode(date);
		}
		
		public static void UserMainCode(String date) {
			String date_pattern = "(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19|20)\\d\\d)";
			if (date.matches(date_pattern)) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
			}
		}
	}

