package multithread;

public class PrioritySetting extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrioritySetting ps3 = new PrioritySetting();
		ps3.setPriority(MAX_PRIORITY);
		ps3.setName("ps3");
		ps3.start();

		PrioritySetting ps = new PrioritySetting();
		ps.setPriority(MIN_PRIORITY);
		ps.setName("ps");
		ps.start();

		PrioritySetting ps1 = new PrioritySetting();
		ps1.setPriority(NORM_PRIORITY);
		ps1.setName("ps1");
		ps1.start();
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
