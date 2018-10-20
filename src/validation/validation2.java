package validation;
import java.util.Scanner;
import java.lang.String;

public class validation2 {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String sentence = sc.nextLine();

			if (UserMainCode(sentence) == true) {
				System.out.print("Valid");
			}
			else {
				System.out.println("Invalid");
			}

		}
		
		public static boolean UserMainCode(String sentence) {
			String[] word = sentence.split("-");
			String[] team_name = word[0].split(" ");
			String[] wordCombined = new String [team_name.length];
			for (int i = 0; i < team_name.length; i++ ){
				wordCombined[i] = Character.toString(team_name[i].charAt(0));
			}
			
			String finalcombined = word[0] + "-";
			for (int r =0; r<team_name.length; r++) {
				finalcombined += wordCombined[r];
			}
			
			return (finalcombined.equals(sentence));

		}
	}


