package Classes_and_Objects_1A;
import java.util.Scanner;

public class Venue {
	String name;
	String city;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Venue p = new Venue();
		
		System.out.println("Enter the venue name");
		p.name = in.nextLine();		
		
		System.out.println("Enter the city name");
		p.city = in.nextLine();
		
		System.out.println("Venue Details :");
		System.out.println("Venue Name : " + p.name + "\n" + "City Name : " + p.city);
	}
}
