package high;

import java.util.List;
import java.util.stream.Collectors;

public class ItermediateStreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes", "Kubernetessss");
		System.out.println(courses.stream()
				.peek(h -> System.out.print(h + " "))
				.filter(course -> course.length() > 11)
				.map(course -> course.toUpperCase())
				.peek(h -> System.out.print("; " + h + "=>"))
				.findFirst());

		System.out.println(courses.stream()
				.peek(h -> System.out.print(h + " "))
				.filter(course -> course.length() > 11)
				.map(course -> course.toUpperCase())
				.peek(h -> System.out.print("; " + h + "=>")));

		System.out.println(courses.stream()
				.peek(h -> System.out.print(h + " "))
				.filter(course -> course.length() > 11)
				.map(course -> course.toUpperCase())
				.peek(h -> System.out.print("; " + h + "=>"))
				.collect(Collectors.toList()));
	}

}
