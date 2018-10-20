package List;
import java.text.DecimalFormat;
import java.util.*;

public class List3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> list = new ArrayList<String>();
		
        for (int i = 0; i < size; i++) {
        	list.add(sc.nextLine());
		}
        
        String x = sc.nextLine();
        
        int count = 0;
        if(!list.isEmpty()) {
        	for (String i : list) {
        		if (i.equalsIgnoreCase(x)) {
        			count++;
        		}
        	}
        }
        System.out.println(count);
	}
}
