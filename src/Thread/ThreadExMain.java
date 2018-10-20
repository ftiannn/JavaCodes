package Thread;

public class ThreadExMain {
	public static void main(String args[]) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println("The Current Thread is " + t.getName());
		System.out.println("The Current Thread Priority is " + t.getPriority());
		
		t.setName("myThread");
		t.setPriority(6);
		System.out.println("The Current Thread is " + t.getName());
		System.out.println("The Current Thread Priority is " + t.getPriority());
		
		ThreadEx ex1 = new ThreadEx("first");
		ThreadEx ex2 = new ThreadEx("second");
		System.out.println("The Thread Priority of ex1 is "
				+ ex1.getPriority());
		System.out.println("The Thread Priority of ex2 is "
				+ ex2.getPriority());
		
		ex1.start();
		ex2.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Printing from : " +
					Thread.currentThread().getName() + " :: " + i);
			System.out.println("The Priority is: " + Thread.currentThread().getPriority() + "\n");

			Thread.sleep(100);
		}
	}
}
