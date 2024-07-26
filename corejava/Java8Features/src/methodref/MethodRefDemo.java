package methodref;

public class MethodRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = (MethodRefDemo::myMethod);
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Parent Thread");
		}
	}

	public static void myMethod() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
