package String;
import java.util.Scanner;
import java.lang.String;
public class coordinates {

		public static void main(String[] args) {
			int x = 0;
			int y = 0;
			
			Scanner sc = new Scanner(System.in);

			int number = sc.nextInt();
			sc.nextLine();
			String command = sc.nextLine();

			for (int i = 0; i<number; i++) {
				char position = command.charAt(i);
				if (position == 'U') {
					y += 1;
				}
				else if (position == 'D') {
					y -= 1;
				}
				
				else if (position == 'R') {
					x += 1;
				}
				
				else if (position == 'L') {
					x -= 1;
				}
			}
			
			System.out.print(x + " " + y);
			
		}
				
	}
