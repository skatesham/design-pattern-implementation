package creational.abstractfactory.product.pizza;

import creational.abstractfactory.factory.abstractfactory.BaseToppingFactory;

//Concrete Product
public class CheesePizza extends Pizza {

	BaseToppingFactory baseToppingFactory;

	public CheesePizza(final BaseToppingFactory baseToppingFactory) {
		super();
		this.baseToppingFactory = baseToppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for cheese pizza.");
		baseToppingFactory.createCheese();
		baseToppingFactory.createSauce();
	}

}
