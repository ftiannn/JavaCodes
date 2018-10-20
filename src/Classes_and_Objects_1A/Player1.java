package Classes_and_Objects_1A;

import java.util.Scanner;

public class Player1 {
	String name;
	String country;
	String skill;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the player details");

			String input = sc.nextLine();
			
			String[] word = input.split(",");
			
			Player1 p = new Player1();
			p.name = word[0];
			p.country = word[1];
			p.skill = word[2];
			
			p.DisplayDetails();

					
		}

	
	void DisplayDetails() {
		System.out.println("Player Details :");
		System.out.println("Player Name : " + name 
				+ "\n" + "Country Name : " + country
				+ "\n" + "Skill : " + skill);
	}
}
