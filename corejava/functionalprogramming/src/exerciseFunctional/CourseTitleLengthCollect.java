package exerciseFunctional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseTitleLengthCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure");
		List<Integer> coursesLength = courseLength(courses);
		System.out.println(coursesLength);
	}

	private static List<Integer> courseLength(List<String> courses) {
		// TODO Auto-generated method stub
		Stream<Integer> s = courses.stream().map(str -> str.length());
		List<Integer> coursesLength = s.collect(Collectors.toList());
		return coursesLength;
	}

}
