package Classes_and_Objects_1A;
import java.util.Scanner;


public class Innings {
	String number;
	String battingTeam;
	Long runs;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Innings d = new Innings();
		
		System.out.println("Enter the innings number");
		d.number = sc.nextLine();
		
		System.out.println("Enter the BattingTeam");
		d.battingTeam = sc.nextLine();
		
		System.out.println("Enter the runs scored");
		d.runs = sc.nextLong();
		
		d.displayInningsDetails();
	}
	
	void displayInningsDetails(){
		System.out.println("Innings Details :");
		System.out.println("Innings number : " + number
				+ "\n" + "BattingTeam : " + battingTeam
				+ "\n" + "Runs scored :" + runs);
	}
}
