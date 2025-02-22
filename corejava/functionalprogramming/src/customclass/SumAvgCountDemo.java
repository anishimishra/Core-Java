package customclass;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SumAvgCountDemo {

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
		
		Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		
		/*System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.map(course -> course.getNoOfStudents())
				.collect(Collectors.toList())
				.sum());
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.map(Course::getNoOfStudents)
				.sum()
				.collect(Collectors.toList()));*/
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.sum());
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.average());
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.count());
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.max());
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.min());
		
	}

}
