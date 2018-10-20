package List;
import java.text.DecimalFormat;
import java.util.*;

public class List2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
        for (int i = 0; i < size; i++) {
        	list.add(sc.nextInt());
		}
        
        Collections.sort(list); 
        
        if(!list.isEmpty()) {
        	for (int i : list) {
        		System.out.println(i);
        	}
        }
	}
}
