package Set;
import java.util.*;

public class Bowlers {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		int player = sc.nextInt();
		sc.nextLine();
		
		HashSet<String> names = new HashSet<String>();
		for (int i = 0; i<player; i++) {
			names.add(sc.nextLine());
		}
		
        Set<String> sortedNames = new TreeSet<String>(names);        
        
		Iterator<String> it = sortedNames.iterator();
		System.out.println("Players list in ascending order");
		while(it.hasNext()) {
			String obj = it.next();
			System.out.println(obj);
			}  
	}
}
