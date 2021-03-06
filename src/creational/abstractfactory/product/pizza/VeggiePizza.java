package creational.abstractfactory.product.pizza;

import creational.abstractfactory.factory.abstractfactory.BaseToppingFactory;

//Concrete Product
public class VeggiePizza extends Pizza {

	BaseToppingFactory baseToppingFactory;

	public VeggiePizza(final BaseToppingFactory baseToppingFactory) {
		super();
		this.baseToppingFactory = baseToppingFactory;
	}

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for veggie pizza.");
		baseToppingFactory.createCheese();
		baseToppingFactory.createSauce();
	}

}
