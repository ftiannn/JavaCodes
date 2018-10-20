package luckybox;
import java.util.Scanner;
public class Lucky4 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int lower = sc.nextInt();
			int upper = sc.nextInt();
				
			for (int i = lower; i <= upper; i++) {
				int evencount = 0;
				int oddcount = 0;
				int no = i;
				int number;
				
				while (no > 0) {
					number=no%10;
					no=no/10;
					if (number%2 == 0 && number!=0) {
						evencount++;
					}
					
					else if (number%2!=0 && number!=0) {
						oddcount++;
					}
					
				}
				
				if (evencount==2 && oddcount==2) {
					System.out.print(i + " ");
				}
			}

		}

}
