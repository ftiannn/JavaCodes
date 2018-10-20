package String;
import java.util.Scanner;
import java.lang.String;

public class ReplaceAll {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			

			System.out.println("Enter team details");
			String team = sc.nextLine();
			
			String replaceString=team.replaceAll("Captain","Skipper");
			System.out.println("After replacement");
			System.out.println(replaceString);

		}
				

}
