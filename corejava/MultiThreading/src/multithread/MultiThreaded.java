package multithread;

public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiThreaded mt = new MultiThreaded();
		mt.start();
		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
			Thread.sleep(1000); // 1000 milliseconds
		}
	}

	public void run() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("child thread exiting");
			}
		}
	}
}
