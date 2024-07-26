package lambdas.anonymous;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 10; i++) {
					System.out.println("Child Thread");
				}
			}
		});

		t.start();
		for (int i = 0; i <= 9; i++) {
			System.out.println("Main Thread");
		}
	}

}
