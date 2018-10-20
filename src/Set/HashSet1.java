package Set;
import java.util.*;

public class HashSet1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		sc.nextLine();
		
		HashSet<String> names = new HashSet<String>();
		for (int i = 0; i<player; i++) {
			names.add(sc.nextLine());
		}
		
		System.out.println(names.size());     
	}
}
