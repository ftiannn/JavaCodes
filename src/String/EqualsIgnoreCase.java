package String;
import java.util.Scanner;
import java.lang.String;
public class EqualsIgnoreCase {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter venue1");
			String s1 = sc.nextLine();
			
			System.out.println("Enter venue2");
			String s2 = sc.nextLine();
			
			if (s1.equalsIgnoreCase(s2) == true) {
				System.out.println("Both the venues are same.");//true because content and case both are same  
			}
			
			else {
				System.out.print("Both the venues are different.");
			}

		}
	}


