package Thread;

public class JoinExMain {
	public static void main(String args[]) throws InterruptedException {
		JoinEx r1 = new JoinEx();
		JoinEx r2 = new JoinEx();
		
		Thread t1 = new Thread(r1, "first");
		Thread t2 = new Thread(r1, "second");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Main Thread Ends Here ");
	}
}
