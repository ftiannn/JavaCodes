package MultiThreading;

public class PrinterThread implements Runnable {
	Thread t;
	String stringA;
	String stringB;
	
	public PrinterThread(String stringA, String stringB) {
		this.stringA = stringA;
		this.stringB = stringB;
		Thread t = new Thread(this);
		t.start();
	}
	
	public void run() {
		StringPrinter.printStrings(stringA, stringB);
	}

}
