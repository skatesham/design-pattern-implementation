package structural.composite.composite;

import java.util.ArrayList;

import lombok.Getter;
import structural.composite.componente.CatalogComponent;

@Getter
public class ProductCatalog extends CatalogComponent {

	private String name;

	private ArrayList<CatalogComponent> items;

	public ProductCatalog(final String name) {
		super();
		this.name = name;
		items = new ArrayList<>();
	}

	@Override
	public void add(final CatalogComponent catalogComponent) {
		this.items.add(catalogComponent);
	}

	@Override
	public void remove(final CatalogComponent catalogComponent) {
		this.items.remove(catalogComponent);
	}

	@Override
	public void print() {
		System.out.println("\n>> Catalog: "+name);
		for (CatalogComponent component : items) {
			component.print();
		}
	}

}
