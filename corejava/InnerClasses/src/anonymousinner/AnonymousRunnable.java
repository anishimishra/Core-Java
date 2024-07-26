package anonymousinner;

public class AnonymousRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Runnable Implementation");
			}

		});
		t.start();
	}

}
