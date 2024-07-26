package assignmentimplementsrunnable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumberThread evenNumberThread = new EvenNumberThread();
		OddNumberThread oddNumberThread = new OddNumberThread();
		Thread t1 = new Thread(evenNumberThread);
		Thread t2 = new Thread(oddNumberThread);
		t1.start();
		t2.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
