package exerciseFunctional;

import java.util.HashMap;
import java.util.List;

public class PrintCharsCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF");
		courses.stream().map(course -> course + ": " + course.length()).forEach(i -> System.out.println(i));

		courses.stream().map(PrintCharsCourses::charCount).forEach(i -> System.out.println(i));

		courses.stream().map(PrintCharsCourses::charCountHashMap).forEach(i -> System.out.println(i));
	}

	private static int charCount(String course) {
		return course.length();
	}

	private static HashMap<String, Integer> charCountHashMap(String course) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(course, course.length());
		return hm;
	}
}
