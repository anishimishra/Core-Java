package multithread;

// THIS IS RECOMMENDED
public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Processed the checks");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckProcessor cp = new CheckProcessor();
		Thread t = new Thread(cp);
		t.start();
	}

}
