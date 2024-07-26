package threadgroups;

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadGroup mt = new ThreadGroup("MyThreadGroup");
		CustomThread thread1 = new CustomThread(mt, "Thread 1");
		CustomThread thread2 = new CustomThread(mt, "Thread 2");
		CustomThread thread3 = new CustomThread(mt, "Thread 3");

		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println(mt.activeCount());
		System.out.println(mt.activeGroupCount());
		mt.list();
		Thread.sleep(5000);
		System.out.println(mt.activeCount());

		mt.list();
	}

}
