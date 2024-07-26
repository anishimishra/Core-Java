package functionalinterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//no input and return something
		Supplier<Integer> twoIntegerSupplier = () -> 2;
		System.out.println(twoIntegerSupplier.get());

		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			int randomNumber = random.nextInt(1000);
			return randomNumber;
		};
		System.out.println(randomIntegerSupplier.get());
	}

}
