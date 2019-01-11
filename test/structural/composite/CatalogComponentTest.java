package structural.composite;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import structural.composite.componente.CatalogComponent;
import structural.composite.composite.ProductCatalog;
import structural.composite.leaf.Product;

public class CatalogComponentTest {

	@Test
	public void printTest() {
		
		CatalogComponent mainComponent = new ProductCatalog("Store Stock");
		CatalogComponent surfItem = new Product("Boardsurf", 200);
		mainComponent.add(surfItem);
		
		CatalogComponent femaleCatalog = new ProductCatalog("Female Products");
		CatalogComponent corsetItem = new Product("Cat Corset", 50);
		CatalogComponent skirtItem = new Product("Miniskirt Black", 25);
		CatalogComponent purseItem = new Product("Pearls Purse", 10000);
		femaleCatalog.add(corsetItem);
		femaleCatalog.add(skirtItem);
		femaleCatalog.add(purseItem);
		
		CatalogComponent jeanFemaleCatalog = new ProductCatalog("Jeans Female Products");
		CatalogComponent tigerJeanItem = new Product("Tiger Jean", 100);
		CatalogComponent sexyJeanItem = new Product("Sexy Jean", 120);
		jeanFemaleCatalog.add(tigerJeanItem);
		jeanFemaleCatalog.add(sexyJeanItem);
		
		femaleCatalog.add(jeanFemaleCatalog);
		
		CatalogComponent maleCatalog = new ProductCatalog("Male Products");
		CatalogComponent shortItem = new Product("Short Surf", 50);
		CatalogComponent umbrellaItem = new Product("Oakley Umbrella", 200);
		CatalogComponent shirtItem = new Product("Tribal Shirt", 25);
		maleCatalog.add(shortItem);
		maleCatalog.add(umbrellaItem);
		maleCatalog.add(shirtItem);
		
		CatalogComponent tenisMaleCatalog = new ProductCatalog("Tenis Male Products");
		CatalogComponent adidasTenisItem = new Product("Neo V Runner Adidas", 300);
		CatalogComponent nikeTenisItem = new Product("Nike Tenis", 100);
		tenisMaleCatalog.add(adidasTenisItem);
		tenisMaleCatalog.add(nikeTenisItem);
		
		maleCatalog.add(tenisMaleCatalog);
		
		mainComponent.add(femaleCatalog);
		mainComponent.add(maleCatalog);
		
		mainComponent.print();
		
		assertTrue(true);
		
	}

}
