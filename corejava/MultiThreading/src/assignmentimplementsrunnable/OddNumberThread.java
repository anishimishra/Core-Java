package assignmentimplementsrunnable;

public class OddNumberThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

}
