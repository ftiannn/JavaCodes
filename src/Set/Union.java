package Set;
import java.util.*;

public class Union {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of top run scorers in season 4");
		int season4 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name of players");
		HashSet<String> names = new HashSet<String>();
		for (int i = 0; i < season4; i++) {
			names.add(sc.nextLine());
		}
		
		System.out.println("Enter the number of top run scorers in season 5");
		int season5 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name of players");
		HashSet<String> name2 = new HashSet<String>();
		for (int i = 0; i <season5; i++) {
			name2.add(sc.nextLine());
		}
		
		System.out.println("Player Set 1");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("Player Set 2");
		for (String name : name2) {
			System.out.println(name);
		}
		
		System.out.println("Union");
	    Set<String> union = new HashSet<String>(names);
	    union.addAll(name2);
	    for (String d : union) {
	    	System.out.println(d);
	    }

	}
}
