package com.framework.learning.executorf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckProcessorTask[] cpt = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };
		ExecutorService service = Executors.newFixedThreadPool(2);
		for (CheckProcessorTask checkProcessorTask : cpt) {
			service.submit(checkProcessorTask);
		}
		service.shutdown();
	}

}
