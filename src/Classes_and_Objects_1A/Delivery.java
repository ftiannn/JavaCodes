package Classes_and_Objects_1A;
import java.util.Scanner;


public class Delivery {
	long over;
	long ball;
	long runs;
	String batsman;
	String bowler;
	String nonStriker;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Delivery d = new Delivery();
		
		System.out.println("Enter the over");
		d.over = sc.nextLong();
		
		System.out.println("Enter the ball");
		d.ball = sc.nextLong();
		
		System.out.println("Enter the runs");
		d.runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		d.batsman = sc.nextLine();
		
		System.out.println("Enter the bowler name");
		d.bowler = sc.nextLine();
		
		System.out.println("Enter the nonStriker name");
		d.nonStriker = sc.nextLine();
		
		d.displayDeliveryDetails();
	}
	
	void displayDeliveryDetails(){
		System.out.println("Delivery Details :");
		System.out.println("Over : " + over
				+ "\n" + "Ball : " + ball
				+ "\n" + "Runs : " + runs
				+ "\n" + "Batsman : " + batsman
				+ "\n" + "Bowler : " + bowler
				+ "\n"  + "NonStriker : " + nonStriker);

	}
}
