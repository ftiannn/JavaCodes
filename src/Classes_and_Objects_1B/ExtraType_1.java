package Classes_and_Objects_1B;
import java.util.*;


public class ExtraType_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ExtraType t = new ExtraType();
		
		System.out.println("Enter the extratype details");
		String n1 = in.nextLine();
		
		String[] parts = n1.split("#");
		t.setName(parts[0]);
		t.setRuns(Long.parseLong(parts[1]));
		
		t.displayDetails();
		
	}
}
