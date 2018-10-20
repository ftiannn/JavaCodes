package validation;

import java.util.Scanner;

public class clara {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	
    	
        int count=0;
        
        for (int i = 0; i < input.length()-2; i++) {
        	int result = Integer.parseInt(input.substring(i, i+3));
                if (result%4 == 0) {
                	count+=1;
                	}
                }
        
        System.out.println(count);
            }
}
