package consumerproducer;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		OrderProducer orderProducer = new OrderProducer(queue);
		OrderConsumer orderConsumer = new OrderConsumer(queue);

		new Thread(orderProducer).start();
		new Thread(orderConsumer).start();
	}

}
