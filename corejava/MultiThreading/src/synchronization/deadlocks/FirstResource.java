package synchronization.deadlocks;

public class FirstResource {
	public synchronized void method1(SecondResource sr) {
		System.out.println("Inside method 1 of FR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Invoking method 2 of SR");
		sr.method2();
	}

	public synchronized void method2() {
		System.out.println("Inside method 2 of FR");
	}
}
