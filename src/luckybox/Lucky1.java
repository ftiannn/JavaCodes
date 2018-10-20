package luckybox;
import java.util.Scanner;
public class Lucky1 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int lower = sc.nextInt();
			int upper = sc.nextInt();
			
			for (int r = lower; r<=upper; r++) {
				int no = r;
				int number;
				int count = 0;
				while (no>0) {
					number = no%10;
					no = no/10;
					if (isPrime(number) == true) {
						count++;
					}
				}
				
				if (count>=2) {
					System.out.print(r + " ");
				}
			}
		}

			
		
		private static boolean isPrime(int num) {   
			if(num==1 ||(num!=2 && num%2==0)){
				return false;
				}
			else{
				for(int i=2;i<num/2;i++){
					if(num%i==0)
						return false;
					}
			}
			return true;
			}

	}


