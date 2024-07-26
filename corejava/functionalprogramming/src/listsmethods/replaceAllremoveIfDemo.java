package listsmethods;

import java.util.ArrayList;
import java.util.List;

public class replaceAllremoveIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		List<String> mCourses = new ArrayList<String>(courses);
		mCourses.replaceAll(str -> str.toUpperCase());
		System.out.println(mCourses);
		mCourses.removeIf(course -> course.length() < 6);
		System.out.println(mCourses);
	}

}
