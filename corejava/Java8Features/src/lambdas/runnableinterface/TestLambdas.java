package lambdas.runnableinterface;

public class TestLambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> {
			for (int i = 0; i <= 9; i++) {
				System.out.println("Child Thread");
			}
		};
		for (int i = 0; i <= 9; i++) {
			System.out.println("Main Thread");
		}
		Thread t = new Thread(r);
		t.start();
	}

}
