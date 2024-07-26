package example;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Product> productList = productsList.stream().filter(p -> p.getPrice() > 30000f)
				.collect(Collectors.toList());
		System.out.println(productList);
		for (Product pr : productList) {
			System.out.println(pr.getId() + " " + pr.getName() + " " + pr.getPrice());
		}
		List<Float> productPriceList = productsList.stream().filter(p -> p.getPrice() > 30000f).map(p -> p.getPrice())
				.collect(Collectors.toList());
		System.out.println(productPriceList);

		productsList.stream().filter(p -> p.getPrice() == 30000).forEach(p -> System.out.println(p.getName()));

		Float totalPrice = productsList.stream().map(p -> p.getPrice()).reduce(0.0f, Float::sum);
		System.out.println(totalPrice);

		Float totalPrice2 = productsList.stream().map(p -> p.getPrice()).reduce(0.0f, (sum, price) -> sum + price);
		System.out.println(totalPrice2);

		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(p -> p.getPrice()));
		System.out.println(totalPrice3);
	}

}
