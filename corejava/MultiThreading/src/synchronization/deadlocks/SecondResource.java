package synchronization.deadlocks;

public class SecondResource {
	public synchronized void method1(FirstResource fr) {
		System.out.println("Inside method 1 of SR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Invoking method 2 of FR");
		fr.method2();
	}

	public synchronized void method2() {
		System.out.println("Inside method 2 of SR");
	}
}
