package Set_RevenueManager;
import java.util.*;

public class Main {
	public static void main(String[] args) {				
		Scanner sc = new Scanner(System.in);
		Set<Revenue> rev = new TreeSet<Revenue>();
		String choice = "yes";
		while(!choice.equals("no")){
			System.out.println("Enter revenue category");
			String cat = sc.nextLine();
			System.out.println("Enter revenue amount");
			int amt = sc.nextInt();
			sc.nextLine();
			rev.add(new Revenue(cat, amt));
			System.out.println("Do you want to continue(yes/no):");
			choice = sc.nextLine();
			}
				
		int sum = 0;
		System.out.println("Top spending categories");
		System.out.println(String.format("%-15s%-15s", "Category", "Amount"));
		for(Revenue r: rev){
				sum = sum + r.getAmount();
				System.out.println(String.format("%-15s%-15s", r.getRevenueCategory(), r.getAmount()));
				}
				
		System.out.println("Total amount earned: " +sum);

			}

		} 

