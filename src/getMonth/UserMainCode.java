package getMonth;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

	public static String getMonthName(String input) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-uu");
		LocalDate date = LocalDate.parse(input, df);
        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY",
        		"JUNE", "JULY", "AUGUST", "SEPTEMBER","OCTOBER", "NOVEMBER", "DECEMBER"};
        return (months[date.getMonthValue()-1]);

	}
}
