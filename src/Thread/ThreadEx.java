package Thread;

public class ThreadEx extends Thread {
	int i = 0;
	
	public ThreadEx(String name) {
		this.setName(name);
	}
	
	public void run() {
		for (i=0; i<5; i++) {
			System.out.println("Printing from  " + Thread.currentThread().getName() + " the value of i :: " + i);
			System.out.println("The Priority is: " + Thread.currentThread().getPriority() + "\n");
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
