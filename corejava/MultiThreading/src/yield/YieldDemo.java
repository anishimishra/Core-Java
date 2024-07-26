package yield;

public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i <= 100; i++) {
			System.out.println("Main thread");
		}
	}

}
