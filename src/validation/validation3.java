package validation;
import java.util.Scanner;
import java.lang.String;

public class validation3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			String country = sc.nextLine();
			String format = sc.nextLine();

			if (ValidatePlayer(name, country, format) == true) {
				System.out.print("Valid");
			}
			else {
				System.out.println("Invalid");
			}

		}




		public static boolean ValidatePlayer(String name, String country, String format) {		
			String c = "";
			if (country.contains(" ")) {
				String[] c1 = country.split(" ");
				for (int r=0; r<c1.length; r++) {
					c += (c1[r].charAt(0));
				}
			}
			
			else {
				c = (country.substring(0,3));
			}
			
			String finalword = name + "#" + c.toUpperCase();
			
			return (finalword.equals(format));
		}
	}


