package example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		Float maxPrice = productsList.stream().max(Comparator.comparing(Product::getPrice)).map(p -> p.getPrice())
				.get();

		System.out.println("Max : " + maxPrice);

		Float minPrice = productsList.stream().min(Comparator.comparing(Product::getPrice)).map(p -> p.getPrice())
				.get();

		System.out.println("Min : " + minPrice);

		Product maxPriceProduct = productsList.stream().max(Comparator.comparing(Product::getPrice)).get();

		System.out.println("Max Product Details : Price: " + maxPriceProduct.getPrice() + ", Name: "
				+ maxPriceProduct.getName() + ", ID: " + maxPriceProduct.getId());
	}

}
