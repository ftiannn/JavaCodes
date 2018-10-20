package String;
import java.util.Scanner;
import java.lang.String;
public class substring {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Player name");
			String player = sc.nextLine();
			
			System.out.println("Enter starting index");
			int start = sc.nextInt();
		    System.out.println("Short name of " + player + ": " + player.substring(start) );
 
		}
	}

