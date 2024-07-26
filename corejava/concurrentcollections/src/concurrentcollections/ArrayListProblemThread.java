package concurrentcollections;

import java.util.Iterator;
import java.util.*;

public class ArrayListProblemThread extends Thread {
	static ArrayList<String> courses = new ArrayList<String>();

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
		ArrayListProblemThread obj = new ArrayListProblemThread();
		obj.start();
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
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
