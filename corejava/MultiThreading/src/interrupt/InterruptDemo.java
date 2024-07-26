package interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		mt.interrupt();
		System.out.println("End of the main method");
	}

}
