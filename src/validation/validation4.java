package validation;
import java.util.Scanner;
import java.util.regex.*;
public class validation4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String country = sc.nextLine();
		
		if (ValidateCity(country) == true) {
			System.out.print("Valid");
		}
		else {
			System.out.println("Invalid");
		}

	}

		public static boolean ValidateCity(String input) {		
			String exp = "^[A-Za-z]{2}.*[a-zA-Z]{2}$";
			return Pattern.matches(exp, input);

		}
	}


