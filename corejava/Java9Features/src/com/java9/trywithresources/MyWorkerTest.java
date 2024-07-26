package com.java9.trywithresources;

public class MyWorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWorker worker = new MyWorker();

		try (worker) {
			worker.doSomething();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
