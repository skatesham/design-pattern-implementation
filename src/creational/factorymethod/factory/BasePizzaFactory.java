package creational.factorymethod.factory;

import creational.factorymethod.product.Pizza;

public abstract class BasePizzaFactory {
	
	// factory method
	public abstract Pizza createPizza(String type);
	
}
