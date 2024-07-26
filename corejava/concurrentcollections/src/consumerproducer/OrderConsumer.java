package consumerproducer;

import java.util.concurrent.*;

public class OrderConsumer implements Runnable {
	private BlockingQueue<String> q;

	public OrderConsumer(BlockingQueue<String> q) {
		this.q = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(q.take());
			System.out.println(q.take());
			System.out.println(q.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
