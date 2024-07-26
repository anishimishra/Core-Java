package synchronization.classlock;

public class synchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread("Steve");
		MyThread mt2 = new MyThread("Mark");

		mt.start();
		mt2.start();
	}

}
