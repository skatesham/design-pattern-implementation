package creational.factorymethod.factory;

import creational.factorymethod.product.CheesePizza;
import creational.factorymethod.product.PepperoniPizza;
import creational.factorymethod.product.Pizza;
import creational.factorymethod.product.VeggiePizza;

// factory method implementation
public class PizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(final String type) {
		Pizza pizza;
		switch (type.toLowerCase()) {
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "pepperoni":
			pizza = new PepperoniPizza();
			break;
		case "veggie":
			pizza = new VeggiePizza();
			break;
		default: throw new IllegalArgumentException("No such pizza.");
		}
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}

}
