package threadcommunication;

public class MyThread extends Thread {
	int total;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child thread is calculating the sum: ");
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			this.notify();
		}
	}
}
