package optional;

import java.util.Optional;

public class OptionalDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[10];
		str[5] = "Java OPTIONAL class";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		checkNull.ifPresent(System.out::println);
		System.out.println(checkNull.get());
		System.out.println(str[5].toLowerCase());
	}

}
