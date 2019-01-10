package creational.factorymethod.product;

//Concrete Product
public class PepperoniPizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for pepperoni pizza.");

	}

}
