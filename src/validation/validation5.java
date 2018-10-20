package validation;
import java.util.Scanner;

public class validation5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		boolean in = validatePlayer(input);
		
		if (in == true) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
					
		}


		public static boolean validatePlayer(String input) {
			if (input.contains("a")){				
				for (int i = 0; i < input.length(); i++) {
					if ((i+1)%2 == 0 && (input.toLowerCase().charAt(i) == 'a'))  {
						return false;
					}
				}
			}
			
			return true;
			
		}
	}



