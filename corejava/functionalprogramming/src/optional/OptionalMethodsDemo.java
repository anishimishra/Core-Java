package optional;

import java.util.Optional;

public class OptionalMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[10];
		str[5] = "JAVA OPTIONAL CLASS";
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		Optional<String> value = Optional.of(str[5]);
		System.out.println(value.filter(s -> s.equals("Abc")));
		System.out.println(value.filter(s -> s.equals("JAVA OPTIONAL CLASS")));
		System.out.println(value.get());
		System.out.println(value.hashCode());
		System.out.println(value.isPresent());
		System.out.println(Optional.ofNullable(str[5]));
		System.out.println(value.orElse("Value is not presemt"));
		System.out.println(empty.orElse("Value is not present"));
		value.ifPresent(System.out::println);
	}

}
