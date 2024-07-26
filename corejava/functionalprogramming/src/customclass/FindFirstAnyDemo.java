package customclass;

import java.util.List;
import java.util.function.Predicate;

public class FindFirstAnyDemo {

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

		Predicate<Course> reviewScoreLessThan90Predicate = course -> course
				.getReviewScore() < 90;
		Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course
				.getReviewScore() > 95;

		System.out.println(courses.stream()
				.filter(reviewScoreLessThan90Predicate)
				.findFirst());

		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.findFirst()
				//.orElse(new Course("default","default",0,0))
				);
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.findAny()//free to select any element in the stream
				//.orElse(new Course("default","default",0,0))
				);
		
	}

}
