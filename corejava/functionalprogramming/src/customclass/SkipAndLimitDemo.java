package customclass;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimitDemo {

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
	
		Comparator<Course> comparingByNoOfStudentsAndReviewScore = Comparator
				.comparingInt(Course::getNoOfStudents)
				.thenComparingInt(Course::getReviewScore)
				.reversed();

		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.limit(5)
				.collect(Collectors.toList()));	
		
		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.skip(3)
				.collect(Collectors.toList()));	
		
		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.skip(3)
				.limit(5)
				.collect(Collectors.toList()));	
	}

}
