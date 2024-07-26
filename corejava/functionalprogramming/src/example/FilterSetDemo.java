package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		Set<Float> productPriceList = productsList.stream().filter(p -> p.getPrice() < 30000).map(p -> p.getPrice())
				.collect(Collectors.toSet());
		System.out.println(productPriceList);

		Map<Integer, String> productPriceMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
		System.out.println(productPriceMap);
		
		List<Float> priceList= productsList.stream()
				.filter(p->p.getPrice()>30000)//filtering price
				.map(pm->pm.getPrice())//fetching price
				.collect(Collectors.toList());
		System.out.println(priceList);
	}

}
