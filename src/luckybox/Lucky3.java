package luckybox;
import java.util.Scanner;

public class Lucky3 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int lower = sc.nextInt();
			int upper = sc.nextInt();
			
			for (int r = lower; r <= upper; r++){
				int sum = 0;
				for (int i =1; i<=r;i++){
					if (r%i==0){
						sum += i;
					}
				}
				if((sum-r)<r){
					System.out.print(r + " ");
				}
			}
		}
	}


