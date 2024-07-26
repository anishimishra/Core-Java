package synchronization.deadlocks;

public class DeadLockDemo implements Runnable {

	FirstResource fr = new FirstResource();
	SecondResource sr = new SecondResource();

	public DeadLockDemo() {
		new Thread(this).start();
		sr.method1(fr); // this will cause a deadlock
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		fr.method1(sr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeadLockDemo();
	}

}
