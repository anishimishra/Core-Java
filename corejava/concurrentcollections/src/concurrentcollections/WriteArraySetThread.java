package concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.*;

public class WriteArraySetThread extends Thread {
	static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<String>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		courses.add("Kubernetes");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteArraySetThread obj = new WriteArraySetThread();
		obj.start();
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		courses.add("Kubernetes");
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String course = iterator.next();
			System.out.println(course);
		}
		System.out.println(courses);
	}

}
