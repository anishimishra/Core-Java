package methodreferences;

import java.util.List;
import java.util.function.Supplier;

public class MethodReferencesCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> courses = 
List.of("Spring", "Spring Boot", "API", 
		"Microservices", "AWS", "PCF", "Azure","Docker","Kubernetes");
courses.stream()
.map(str->str.toUpperCase())
.forEach(str->System.out.print(str+"  "));
System.out.println();

courses.stream()
.map(str->str.toUpperCase())
.forEach(System.out::print);
System.out.println();

courses.stream()
.map(str->str.toUpperCase())
.forEach(MethodReferencesCourses::print);
System.out.println();

courses.stream()
.map(String::toUpperCase)
.forEach(MethodReferencesCourses::print);
System.out.println();

Supplier<String> supplier=String::new;
System.out.println(supplier);
supplier.get();
	}
private static void print(String str) {
	System.out.print(str+" ");
}
}
