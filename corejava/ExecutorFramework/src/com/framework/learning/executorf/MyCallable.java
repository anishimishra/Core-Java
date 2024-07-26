package com.framework.learning.executorf;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	int num;

	MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " is calculating the sum of all the numbers upto " + num);
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

}
