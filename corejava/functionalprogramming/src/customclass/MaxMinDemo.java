package customclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MaxMinDemo {
	public static void main(String args[]) {
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
		
		Predicate<Course> reviewScoreLessThan90Predicate = course -> course
				.getReviewScore() < 90;
		
		Comparator<Course> comparingByNoOfStudentsAndReviewScore = Comparator
				.comparingInt(Course::getNoOfStudents)
				.thenComparingInt(Course::getReviewScore)
				.reversed();
		
		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.collect(Collectors.toList()));

		System.out.println(courses.stream()
				// max returns the last element of the list
				.max(comparingByNoOfStudentsAndReviewScore));

		System.out.println(courses.stream()
				// max returns the first element of the list
				.min(comparingByNoOfStudentsAndReviewScore)
				.orElse(new Course("default", "default", 0, 0)));

		System.out.println(
				courses.stream()
				.filter(reviewScoreLessThan90Predicate)
				.min(comparingByNoOfStudentsAndReviewScore)
				.orElse(new Course("default", "default", 0, 0)));
	}
}
