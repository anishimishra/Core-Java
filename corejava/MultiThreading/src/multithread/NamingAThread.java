package multithread;

public class NamingAThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamingAThread nt = new NamingAThread();
		nt.start();

		Thread currentThread = Thread.currentThread();
		System.out.println("Name is : " + currentThread.getName());
	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println("Name is : " + currentThread.getName());
		currentThread.setName("Print 200 numbers");
		System.out.println("Name is : " + currentThread.getName());
	}
}
