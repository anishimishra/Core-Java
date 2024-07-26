package daemon;

public class DaemonDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon());
		MyThread myThread = new MyThread();
		// myThread.start(); - gives IllegalThreadStateException
		myThread.setDaemon(true);
		System.out.println(myThread.isDaemon());
		myThread.start();
	}
}