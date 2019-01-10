package creational.factorymethod.product;

//Concrete Product
public class VeggiePizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for veggie pizza.");

	}

}
