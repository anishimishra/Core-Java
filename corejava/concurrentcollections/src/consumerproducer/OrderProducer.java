package consumerproducer;

import java.util.concurrent.*;

public class OrderProducer implements Runnable {
	private BlockingQueue<String> q;

	public OrderProducer(BlockingQueue<String> q) {
		this.q = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			q.put("Mac Book Pro");
			q.put("Dell Laptop");
			q.put("iPhone");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
