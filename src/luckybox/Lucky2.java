package luckybox;
import java.util.Scanner;

public class Lucky2 {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int lower = sc.nextInt();
			int upper = sc.nextInt();
			
			for (int r = lower; r<=upper; r++) {
				if (r < 9) {
					System.out.print(r + " ");
				}
				else {
					if (isPan(r) == true) {
						System.out.print(r + " ");
					}
				}
			}
		}
			
		
		public static boolean isPan(int number) {
		    int palindrome = number;
		    int reverse = 0;

		    while (palindrome != 0) {
		        int remainder = palindrome % 10;
		        reverse = reverse * 10 + remainder;
		        palindrome = palindrome / 10;
		    }

		    if (number == reverse) {
		        return true;
		    }
		    return false;
		}
	}


