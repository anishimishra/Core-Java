package lambdas.runnableinterface;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new MyRunnableImpl();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 9; i++) {
			System.out.println("Main Thread");
		}
	}

}
