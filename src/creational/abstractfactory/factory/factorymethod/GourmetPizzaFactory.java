package creational.abstractfactory.factory.factorymethod;

import creational.abstractfactory.factory.abstractfactory.BaseToppingFactory;
import creational.abstractfactory.factory.abstractfactory.GourmetToppingFactory;
import creational.abstractfactory.product.pizza.CheesePizza;
import creational.abstractfactory.product.pizza.PepperoniPizza;
import creational.abstractfactory.product.pizza.Pizza;
import creational.abstractfactory.product.pizza.VeggiePizza;

// factory method implementation
public class GourmetPizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(final String type) {
		Pizza pizza;
		BaseToppingFactory baseToppingFactory = new GourmetToppingFactory();
		switch (type.toLowerCase()) {
		case "cheese":
			pizza = new CheesePizza(baseToppingFactory);
			break;
		case "pepperoni":
			pizza = new PepperoniPizza(baseToppingFactory);
			break;
		case "veggie":
			pizza = new VeggiePizza(baseToppingFactory);
			break;
		default:
			throw new IllegalArgumentException("No such pizza.");
		}
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}

}
