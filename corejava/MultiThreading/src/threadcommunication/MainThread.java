package threadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		synchronized (mt) {
			System.out.println("Main thread is going to wait");
			mt.wait();
			System.out.println("Main thread notified");
			System.out.println(mt.total);
		}
	}

}
