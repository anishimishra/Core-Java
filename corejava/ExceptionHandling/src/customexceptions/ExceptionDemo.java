package customexceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			System.out.println("yes");
		} catch (InterruptedException e) {
			throw new MyThreadException();
		}
	}

}
