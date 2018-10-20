package String;
import java.util.Scanner;
import java.lang.String;
public class StartsEndsWith {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of players");
			int number = sc.nextInt();
			sc.nextLine();
			
			String[] name = new String [number]; 
			
			System.out.println("Enter the player name");
			for (int i =0; i<name.length; i++) {
				name[i] = sc.nextLine();
			}
			
			System.out.println("Player name starting with 'M' or Ending with 'a'");
			for (int r = 0; r<name.length; r++) {
				if (name[r].startsWith("M") == true || (name[r].endsWith("a") == true)) {
					System.out.println(name[r]);
				}
			}
		}

}
