package List_2;
import java.util.*;

public class PlayerList {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> names = new ArrayList<String>();
		for (int i = 0; i<player; i++) {
			names.add(sc.nextLine());
		}
		
		
		int choice;
		do {
			displayMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: 
				names.add(sc.nextLine());
				System.out.println("Player details after insertion");
				for (String p : names) {
					System.out.println(p);
				}
				System.out.println("Do you want to continue");
				if (sc.nextLine().equalsIgnoreCase("no")) {
					System.exit(0);
				}
				break;
				
			case 2:
				names.remove(sc.nextLine());
				System.out.println("Player details after deletion");
				for (String p : names) {
					System.out.println(p);
				}
				System.out.println("Do you want to continue");
				if (sc.nextLine().equalsIgnoreCase("no")) {
					System.exit(0);
				}
				break;
				
			default: 
				break;
			}
		} while (choice != 2);
	}
	
	public static void displayMenu() {
		System.out.println("Menu");
		System.out.println("1.Insert Players");
		System.out.println("2.Delete Players");
	}

}
