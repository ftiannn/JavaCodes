package Classes_and_Objects_1B;
import java.util.*;

public class Player_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Player p = new Player();
		
		System.out.println("Enter the player name");
		p.setName(in.nextLine());
		
		System.out.println("Enter the country name");
		p.setCountry(in.nextLine());
		
		System.out.println("Enter the skill");
		p.setSkill(in.nextLine());
		
		p.displayDetails();
		
		System.out.println("Verify and Update Player Details");
		p.menu();
		
		int input = 0;
		do {
			input = in.nextInt();
			in.nextLine();
			switch(input) {
				case 1: 
					p.updatePlayer();
					p.setName(in.nextLine());
					p.menu();
					break;
			
				case 2: 
					p.updateCountry();
					p.setCountry(in.nextLine());
					p.menu();
					break;
			
				case 3: 
					p.updateSkill();
					p.setSkill(in.nextLine());
					p.menu();
					break;
					
				case 4:
					p.displayDetails();
					break;
			} 
		} while (input != 4);
	}
}
