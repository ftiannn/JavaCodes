package Classes_and_Objects_1A;
import java.util.Scanner;


public class Venue1 {
	String name;
	String city;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the venue details");

			String input = sc.nextLine();
			
			String[] word = input.split(",");
			
			Venue1 p = new Venue1();
			p.name = word[0];
			p.city = word[1];
			
			p.DisplayDetails();

					
		}
	void DisplayDetails() {
	System.out.println("Venue Details");
	System.out.println("Venue Name : " + name + "\n" + "City Name : " + city);
	}
}
