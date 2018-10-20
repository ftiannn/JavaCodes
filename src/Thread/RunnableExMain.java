package Thread;

public class RunnableExMain {
	public static void main(String args[]) throws InterruptedException {
		ThreadRunnableEx r1 = new ThreadRunnableEx();
		ThreadRunnableEx r2 = new ThreadRunnableEx();
		
		Thread t1 = new Thread(r1, "first");
		Thread t2 = new Thread(r2, "second");
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " :: " + i);
			Thread.sleep(100);
		}
	}

}
