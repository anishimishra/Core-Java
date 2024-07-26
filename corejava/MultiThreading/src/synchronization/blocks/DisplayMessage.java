package synchronization.blocks;

public class DisplayMessage {
	public void sayHello(String name) {
		// any code go here
		System.out.println("any");
		synchronized (this) {
			for (int i = 0; i <= 3; i++) {
				System.out.println("How are you? " + name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
