package synchronization.blocks;

public class synchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMessage dm = new DisplayMessage();
		MyThread mt = new MyThread(dm, "Steve");
		MyThread mt2 = new MyThread(dm, "Mark");
		MyThread mt3 = new MyThread(dm, "big");
		MyThread mt4 = new MyThread(dm, "small");
		mt.start();
		mt2.start();
		mt3.start();
		mt4.start();
	}

}
