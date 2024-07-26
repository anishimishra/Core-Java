package threadgroups;

public class CustomThread extends Thread {

	CustomThread(ThreadGroup g, String name) {
		super(g, name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
