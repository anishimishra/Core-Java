package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String lower = str[5].toLowerCase();
			System.out.println(lower);
		} else {
			System.out.println("string value is not present");
		}
	}

}
