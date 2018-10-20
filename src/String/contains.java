package String;
import java.util.Scanner;
import java.lang.String;
public class contains {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number of players");
			int number = sc.nextInt();
			sc.nextLine();
			
			String[] name = new String [number]; 
			
			System.out.println("Enter player names");
			for (int i =0; i<name.length; i++) {
				name[i] = sc.nextLine();
			}
			
			for (int r = 0; r<name.length; r++) {
				if ((name[r].contains("Sharma")) == true) {
					System.out.println(name[r]);
				}
			}
		}
				
	}

