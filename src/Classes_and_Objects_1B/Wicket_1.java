package Classes_and_Objects_1B;

import java.util.Scanner;

public class Wicket_1 {
	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	Wicket w = new Wicket();
	
	System.out.println("Enter the over");
	long over = in.nextLong();
	System.out.println("Enter the ball");
	long ball = in.nextLong();
	in.nextLine();
	
	System.out.println("Enter the wicket type");
	String wicketType = in.nextLine();
	
	System.out.println("Enter the player name");
	String playerName = in.nextLine();
	
	System.out.println("Enter the bowler name");
	String bowlerName = in.nextLine();
	
	w.setOver(over);
	w.setBall(ball);
	w.setWicketType(wicketType);
	w.setPlayerName(playerName);
	w.setBowlerName(bowlerName);
	
	w.displayDetails();
}
}
