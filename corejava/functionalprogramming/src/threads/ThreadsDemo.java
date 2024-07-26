package threads;

public class ThreadsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10000; i++) {
					System.out.println(Thread.currentThread().getId() + ":" + i);
				}
			}
		};

		Runnable runnable2 = () -> {

			// TODO Auto-generated method stub
			for (int i = 0; i < 10000; i++) {
				System.out.println(Thread.currentThread().getId() + ":" + i);
			}
		};

		Thread thread = new Thread(runnable2);
		thread.start();
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		Thread thread3 = new Thread(runnable2);
		thread3.start();
	}

}
