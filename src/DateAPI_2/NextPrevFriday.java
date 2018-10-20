package DateAPI_2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class NextPrevFriday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year in Integer");
		int year = s.nextInt();
		System.out.println("Enter Month in Integer");
		int month = s.nextInt();
		System.out.println("Enter date in Integer");
		int date = s.nextInt();
		
		DisplayDate(year, month, date);

	}
	
	public static void DisplayDate(int year, int month, int date) {
		LocalDate d = LocalDate.of(year,month,date);
		LocalDate next = d.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		LocalDate prev = d.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
		
		System.out.println("Next Friday: " + next);
		System.out.println("Previous Friday: " + prev);
	}

}
