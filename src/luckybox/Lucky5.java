package luckybox;
import java.util.Scanner;

public class Lucky5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int lower = sc.nextInt();
			int upper = sc.nextInt();
			

			
			for (int i = lower; i <= upper; i++) {
				if (isPrime(i) == true) {
					System.out.print(i + " ");
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

