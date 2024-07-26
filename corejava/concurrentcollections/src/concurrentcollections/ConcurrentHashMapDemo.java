package concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.*;

public class ConcurrentHashMapDemo extends Thread {
	static ConcurrentHashMap<String, String> courseRating = new ConcurrentHashMap<String, String>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		courseRating.put("Kubernetes", "4.5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMapDemo obj = new ConcurrentHashMapDemo();
		obj.start();
		courseRating.put("Java", "5.0");
		courseRating.put("Python", "4.8");
		courseRating.put("AWS", "3.4");
		courseRating.put("Docker", "4.7");
		Iterator<String> iterator = courseRating.keySet().iterator();
		while (iterator.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String course = iterator.next();
			System.out.println(courseRating.get(course));
		}
		System.out.println(courseRating);
	}

}
