package MultiThreading;

public class StringPrinter {
	static synchronized void printStrings(String stringA, String stringB) {
		System.out.print(stringA);
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(stringB);
	}
}
