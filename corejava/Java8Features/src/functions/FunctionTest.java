package functions;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("ANISHI"));
		System.out.println(f.apply("mishrar"));
	}

}
