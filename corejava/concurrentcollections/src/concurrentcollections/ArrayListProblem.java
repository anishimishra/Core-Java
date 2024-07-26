package concurrentcollections;

import java.util.*;

public class ArrayListProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		Iterator<String> iterator = courses.iterator();
		/*
		 * while(iterator.hasNext()) { System.out.println(iterator.next());
		 * //courses.add("Node"); -- java.util.ConcurrentModificationException }
		 */
		while (iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
			if (course.equals("Docker")) {
				courses.remove(course);
			}
		}
	}

}
