package customclass;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndComparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), 
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), 
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), 
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

		Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator
				.comparingInt(Course::getNoOfStudents);

		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsIncreasing)
				.collect(Collectors.toList()));

		Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator
				.comparingInt(Course::getNoOfStudents)
				.reversed();

		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsDecreasing)
				.collect(Collectors.toList()));

		Comparator<Course> comparingByNoOfStudentsAndReviewScore = Comparator
				.comparingInt(Course::getNoOfStudents)
				.thenComparingInt(Course::getReviewScore)
				.reversed();

		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.collect(Collectors.toList()));
	}

}
