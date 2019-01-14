package structural.composite.componente;

public abstract class CatalogComponent {

	// Composite Methods:

	public void add(final CatalogComponent catalogComponent) {
		throw new UnsupportedOperationException("Cannot add item to catalog.");
	}

	public void remove(final CatalogComponent catalogComponent) {
		throw new UnsupportedOperationException("Cannot remove item from catalog.");
	}

	// Operation Methods:

	public String getName() {
		throw new UnsupportedOperationException("Cannot return name.");
	}

	public double getPrice() {
		throw new UnsupportedOperationException("Cannot return price.");
	}

	public void print() {
		throw new UnsupportedOperationException("Cannot print.");
	}
}
