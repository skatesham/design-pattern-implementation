package creational.factorymethod;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import creational.factorymethod.factory.BasePizzaFactory;
import creational.factorymethod.factory.PizzaFactory;
import creational.factorymethod.product.Pizza;

public class PizzaFactoryTest {

	@Test
	public void testMakePizzas() {
		BasePizzaFactory pizzaFactory = new PizzaFactory();
		Pizza cheese = pizzaFactory.createPizza("cheese");
		Pizza veggie = pizzaFactory.createPizza("veggie");
		assertTrue(true);
	}
}
