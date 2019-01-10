package creational.abstractfactory.product.pizza;

import creational.abstractfactory.factory.abstractfactory.BaseToppingFactory;

//Concrete Product
public class PepperoniPizza extends Pizza {

	BaseToppingFactory baseToppingFactory;

	public PepperoniPizza(BaseToppingFactory baseToppingFactory) {
		super();
		this.baseToppingFactory = baseToppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for pepperoni pizza.");
		baseToppingFactory.createCheese();
		baseToppingFactory.createSauce();
	}

}
