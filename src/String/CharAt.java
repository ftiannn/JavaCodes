package String;
import java.util.Scanner;
import java.lang.String;
public class CharAt {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter team1");
			String s1 = sc.nextLine();
			
			System.out.println("Enter team2");
			String s2 = sc.nextLine();
			
			System.out.println("Enter third character");
			char c = sc.next().charAt(0);
			
			char s1c = s1.charAt(2);
			char s2c = s2.charAt(2);
			
			if (s1c==c) {
				System.out.print("Winner Team : " +s1);
			}
			else if (s2c == c) {
				System.out.print("Winner Team : " +s2);
			}
			
			else {
				System.out.print("invalid input");
			}

		}
}
	
	
