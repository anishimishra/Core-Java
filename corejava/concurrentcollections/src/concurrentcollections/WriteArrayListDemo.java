package concurrentcollections;

import java.util.*;
import java.util.concurrent.*;

public class WriteArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<String>();
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			courses.add("Node");
		}

		while (iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
			if (course.equals("Docker")) {
				courses.remove(course);
			}
		}
		System.out.println(courses);
	}

}
