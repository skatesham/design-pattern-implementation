package creational.abstractfactory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import creational.abstractfactory.factory.factorymethod.BasePizzaFactory;
import creational.abstractfactory.factory.factorymethod.GourmetPizzaFactory;
import creational.abstractfactory.factory.factorymethod.SicilianPizzaFactory;
import creational.abstractfactory.product.pizza.Pizza;

public class PizzaFactoryTest {

	@Test
	public void testMakePizzasGourmet() {
		BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
		Pizza cheese = pizzaFactory.createPizza("cheese");
		Pizza veggie = pizzaFactory.createPizza("veggie");
		assertTrue(true);
	}
	
	@Test
	public void testMakePizzasSicilian() {
		BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
		Pizza cheese = pizzaFactory.createPizza("cheese");
		Pizza veggie = pizzaFactory.createPizza("veggie");
		assertTrue(true);
	}
}
