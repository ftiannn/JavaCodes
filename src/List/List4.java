package List;
import java.util.*;

public class List4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the team name");
		String team = in.nextLine();
		
		System.out.println("Enter the number of matches played in home ground");
		int home_match = in.nextInt();
		
		System.out.println("Enter the runs scored");
		ArrayList<Integer> run = new ArrayList<Integer>();
		for (int i = 0; i<home_match; i++) {
			run.add(in.nextInt());
		}
		
		System.out.println("Enter the number of matches played in other ground");
		int away_match = in.nextInt();
		System.out.println("Enter the runs scored");
		for (int r = 0; r<away_match; r++) {
			run.add(in.nextInt());
		}
		
		if (!run.isEmpty()) {
			System.out.println("Runs scored by " + team);
			for (int l : run) {
				System.out.println(l);
			}
			System.out.println("Run scored by " + team + " more than 300");
			for (int p : run) {
				if (p>300) {
					System.out.println(p);
				}
			}
		}
		
	}
}
