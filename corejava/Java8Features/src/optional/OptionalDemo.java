package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> empty = Optional.empty();
		System.out.println("isPresent? " + empty.isPresent());
		Optional<String> data = Optional.of("Optional but very useful");
		System.out.println("isPresent? " + data.isPresent());
		System.out.println("Value: " + data.get());
		if (empty.isPresent()) {
			System.out.println(empty.get());
		}
		System.out.println(data.filter(str -> str.equals("Optional but very useful")));
		System.out.println(data.filter(str -> str.equals("but")));
		System.out.println(data.orElse("Default value"));
		System.out.println(empty.orElse("Default value"));
		data.ifPresent(System.out::println);
		empty.ifPresent(System.out::println);
	}
}