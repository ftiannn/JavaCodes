package validation;
import java.util.Scanner;

public class validationV {	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    
	    if (validateOver(input) == true) {
	    	System.out.println("Valid");
	    }
	    
	    else {
	    	System.out.println("Invalid");
	    }

	}
	
	public static boolean validateOver(String input) {
		
		int count = 0;
		boolean haha = true;
		
		if (input.length() != 6) {
			haha = false;
		}
		
	    for (int i = 0; i < input.length(); i++){
	        char c = input.charAt(i);
	        if (c == 'N') {
	        	haha = false;
	        	}
	        else if (c == 'W') {
	        	count +=1; 
	        	}
	    }
	    
	    if (count == 0) {
	    	haha = false;
	    	}
	    
	    return haha;
	}
}