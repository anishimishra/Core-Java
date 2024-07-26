package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<>();
		l1.add("JOHN");
		l1.add("BHARATH");
		l1.add("JIM");
		System.out.println(l1);
		List<String> l2 = l1.stream()
				.map(s -> s.toLowerCase())
				.collect(Collectors.toList());
		System.out.println(l2);
	}

}
