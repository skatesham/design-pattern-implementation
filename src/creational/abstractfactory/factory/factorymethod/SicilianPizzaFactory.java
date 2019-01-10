package creational.abstractfactory.factory.factorymethod;

import creational.abstractfactory.factory.abstractfactory.BaseToppingFactory;
import creational.abstractfactory.factory.abstractfactory.SicillianToppingFactory;
import creational.abstractfactory.product.pizza.CheesePizza;
import creational.abstractfactory.product.pizza.PepperoniPizza;
import creational.abstractfactory.product.pizza.Pizza;
import creational.abstractfactory.product.pizza.VeggiePizza;

// factory method implementation
public class SicilianPizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		BaseToppingFactory baseToppingFactory = new SicillianToppingFactory();
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
