package com.java9.trywithresources;

public class MyWorker implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("closing the resource");
	}

	MyWorker() {
		System.out.println("creating the resource");
	}

	public void doSomething() {
		System.out.println("doing something");
	}
}
