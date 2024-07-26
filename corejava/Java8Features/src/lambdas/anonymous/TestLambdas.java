package lambdas.anonymous;

public class TestLambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child thread");
			}
		});

		t.start();
		for (int i = 0; i <= 9; i++) {
			System.out.println("Main thread");
		}
	}

}
