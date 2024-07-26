package synchronization;

public class synchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMessage dm = new DisplayMessage();
		MyThread mt = new MyThread(dm, "Steve");
		MyThread mt2 = new MyThread(dm, "Mark");

		mt.start();
		mt2.start();
	}

}
