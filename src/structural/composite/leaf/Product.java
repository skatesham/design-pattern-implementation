package structural.composite.leaf;

import lombok.Getter;
import structural.composite.componente.CatalogComponent;

@Getter
public class Product extends CatalogComponent {

	private String name;
	private double price;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println("Product name: "+name+" Price: "+price);
	}

	
}
