package exerciseFunctional;

import java.util.List;

public class printCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF");
		courses.stream().forEach(i -> System.out.print(i + " "));
		wordSpring(courses);
		wordCount(courses);
	}

	private static void wordCount(List<String> list) {
		// TODO Auto-generated method stub
		list.stream().filter(printCourses::countLetters).forEach(i -> System.out.print(i + " "));
		System.out.println();
		list.stream().filter(str -> str.length() >= 4).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}

	private static boolean countLetters(String str) {
		if (str.length() >= 4) {
			return true;
		} else {
			return false;
		}
	}

	private static void wordSpring(List<String> list) {
		// TODO Auto-generated method stub
		System.out.println();
		list.stream().filter(printCourses::wordCheck).forEach(i -> System.out.print(i + " "));
		System.out.println();
		list.stream().filter(str -> str.contains("Spring")).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}

	private static boolean wordCheck(String str) {
		if (str.contains("Spring")) {
			return true;
		} else {
			return false;
		}
	}

}
