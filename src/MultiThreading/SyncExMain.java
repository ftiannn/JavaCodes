package MultiThreading;

public class SyncExMain {
	public static void main(String args[]) {
		new PrinterThread("Hello..", "There");
		new PrinterThread("How,", "are you");
		new PrinterThread("Thank you,", "very much");
	}
}
