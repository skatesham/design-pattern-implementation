package creational.abstractfactory.factory.factorymethod;

import creational.abstractfactory.product.pizza.Pizza;

public abstract class BasePizzaFactory {
	
	// factory method
	public abstract Pizza createPizza(String type);
	
}
