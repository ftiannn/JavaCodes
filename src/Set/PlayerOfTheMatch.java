package Set;
import java.util.*;

public class PlayerOfTheMatch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		sc.nextLine();
		
		HashSet<String> names = new HashSet<String>();
		for (int i = 0; i<player; i++) {
			names.add(sc.nextLine());
		}
		
		List<String> sortedNames = new ArrayList<String>(names);
		Collections.sort(sortedNames);
		
		Iterator<String> it = sortedNames.iterator();
		while(it.hasNext()) {
			String obj = it.next();
			System.out.println(obj);
			}  
	}
}
