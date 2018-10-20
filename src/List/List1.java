package List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class List1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
        for (int i = 0; i < size; i++) {
        	list.add(sc.nextInt());
		}
        
        Integer sum = 0;
        if (!list.isEmpty()) {
        	for (int i: list) {
        		sum += i;
        	}
        
        double avg = sum.doubleValue()/size;
        
        
        System.out.println(sum + "\n" + avg);	
        }
	}
}
