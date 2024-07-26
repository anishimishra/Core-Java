package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsToListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> id = Arrays.asList("123", "456", "789");
		List<Integer> idsInInt = id.stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> idsInInt2 = id.stream().map(Integer::parseInt).toList();
		System.out.println(idsInInt);
		System.out.println(idsInInt2);
	}

}
