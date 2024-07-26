package random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomGenerator generator = RandomGeneratorFactory
				.getDefault().create();
		RandomGenerator generator2 = RandomGeneratorFactory
				.of("Xoshiro256PlusPlus").create();
		System.out.println(generator.getClass());
		System.out.println(generator2.getClass());
		RandomGeneratorFactory.all()
		.map(factory -> factory.group() + ":" + factory.name())
		.sorted()
				.forEach(System.out::println);
		int i = 0;
		while (i <= 10) {
			int num = generator.nextInt(20);
			System.out.println(num);
			i++;
		}
	}

}
