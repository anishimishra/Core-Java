package programming;

import java.util.function.*;

public class PlayingAround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Consumer<String> cons=() ->{}; will give error

		Consumer<String> cons = (str) -> {
		};
		System.out.println(cons);

		Consumer<String> con = System.out::println;
		System.out.println(con);

		Consumer<String> consumer = str -> System.out.println(str);
		System.out.println(consumer);

		Consumer<String> consume = str -> {
			System.out.print(str + "   ");
			System.out.println(str);
		};
		System.out.println(consume);
		consume.accept("k");

		BiConsumer<String, String> co = (str, str2) -> System.out.println(str);
		System.out.println(co);

		Supplier<String> supplier = () -> {
			return "Anishi";
		};
		System.out.println(supplier);

		Supplier<String> supp = () -> "Anishi";
		System.out.println(supp);
	}

}
