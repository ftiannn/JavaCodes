package String;
import java.util.Scanner;
import java.lang.String;
public class index {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	
			System.out.println("Enter the number of players");
			int number = sc.nextInt();
			sc.nextLine();
			
			String str = "";
			for (int i = 0; i<number; i++) {
				String mem = sc.nextLine(); 
				if (mem.indexOf('a') == mem.lastIndexOf('a')) {
					str = mem;
				}
			}
			System.out.println("Player of the Match:");
			System.out.println(str);
			
		}
	}

