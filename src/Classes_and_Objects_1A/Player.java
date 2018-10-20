package Classes_and_Objects_1A;
import java.util.Scanner;

public class Player {
	public static void main(String[] args) {
		Details();
	}
	
	public static void Details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		String name = sc.nextLine();
		System.out.println("Enter the country name");
		String country = sc.nextLine();
		System.out.println("Enter the skill");
		String skill = sc.nextLine();

		System.out.println("Player Details : ");
		System.out.println("Player Name : " + name);
		System.out.println("Country Name : " + country);
		System.out.println("Skill : " + skill);
	}
}
