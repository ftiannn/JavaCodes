package Classes_and_Objects_1B;

import java.util.Scanner;


public class Team_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Team t = new Team();
		
		System.out.println("Enter the team name");
		t.setName(in.nextLine());
		System.out.println("Enter the coach name");
		t.setCoach(in.nextLine());
		System.out.println("Enter the location name");
		t.setLocation(in.nextLine());
		System.out.println("Enter the players name");
		t.setPlayers(in.nextLine());
		System.out.println("Enter the captain name");
		t.setCaptain(in.nextLine());

		t.displayTeamDetails();
	}
}