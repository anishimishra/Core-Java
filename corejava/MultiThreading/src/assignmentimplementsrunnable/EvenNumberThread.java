package assignmentimplementsrunnable;

public class EvenNumberThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
	}
}
