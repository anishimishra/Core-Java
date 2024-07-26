package high;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JoiningStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure");
System.out.println(courses.stream( ).collect(Collectors.joining(" ")));
System.out.println(courses.stream().collect(Collectors.joining(", ")));
String a[]="Spring".split("");
for (String ele : a) {
	System.out.print(ele+" ");
}
System.out.println();
System.out.println(courses.stream()
.map(course->course.split("")));
System.out.println(courses.stream()
		.map(course->course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
List<String> splittedCourses = courses.stream()
.map(course->course.split(""))
.flatMap(Arrays::stream)
.distinct()
.collect(Collectors.toList());
System.out.println(splittedCourses);
System.out.println();

List<String> courses2 = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure");
System.out.println(courses.stream()
		.flatMap(course->courses2.stream()
				.map(course2->List.of(course,course2)))
		.collect(Collectors.toList()));

System.out.println(courses.stream()
		.flatMap(course->courses2.stream()
				.map(course2->List.of(course,course2)))
		.filter(list->!list.get(0).equals(list.get(1)))
		.collect(Collectors.toList()));

System.out.println(courses.stream()
		.flatMap(course->courses2.stream()
				.filter(course2->course2.length()==course.length())
				.map(course2->List.of(course,course2)))
		.filter(list->!list.get(0).equals(list.get(1)))
		.collect(Collectors.toList()));
	}

}
