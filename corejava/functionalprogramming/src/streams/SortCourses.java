package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure");
		Stream<String> courseStream = courses.stream().sorted();
		courseStream.forEach(i -> System.out.print(i + " "));

		System.out.println();

		Stream<String> courseStreamNatural = courses.stream().sorted(Comparator.naturalOrder());
		courseStreamNatural.forEach(i -> System.out.print(i + " "));

		System.out.println();

		Stream<String> courseStreamReverse = courses.stream().sorted(Comparator.reverseOrder());
		courseStreamReverse.forEach(i -> System.out.print(i + " "));

		System.out.println();

		Stream<String> courseStreamLength = courses.stream().sorted(Comparator.comparing(str -> str.length()));
		courseStreamLength.forEach(i -> System.out.print(i + " "));
	}

}
