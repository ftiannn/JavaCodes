package Thread;

public class JoinEx implements Runnable {
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println("Printing from " 
					+ Thread.currentThread().getName()
					+ " , the value of i : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
