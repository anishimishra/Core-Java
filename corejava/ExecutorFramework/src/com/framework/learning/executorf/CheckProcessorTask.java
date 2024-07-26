package com.framework.learning.executorf;

public class CheckProcessorTask implements Runnable {

	String name;

	CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out
				.println(name + " check processor has began processing the check " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(
				name + " check processor has completed processing the check " + Thread.currentThread().getName());
	}

}
