package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> priceList = productsList.stream()
				.map(p -> p.getPrice())
				.collect(Collectors.toList());
		System.out.println(priceList);
		Set<Float> priceSet = productsList.stream()
				.map(p -> p.getPrice())
				.collect(Collectors.toSet());
		System.out.println(priceSet);
		Double sumPrices = productsList.stream()
				.collect(Collectors
						.summingDouble(p -> p.getPrice()));
		System.out.println(sumPrices);
		Integer sumId = productsList.stream()
				.collect(Collectors
						.summingInt(p -> p.getId()));
		System.out.println(sumId);
		Double avg = productsList.stream()
				.collect(Collectors
						.averagingDouble(p -> p.getPrice()));
		System.out.println(avg);
		Long noOfElements = productsList.stream()
				.collect(Collectors
						.counting());
		System.out.println(noOfElements);
	}

}
