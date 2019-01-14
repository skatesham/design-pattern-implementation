package creational.abstractfactory.factory.abstractfactory;

import creational.abstractfactory.product.topping.Cheese;
import creational.abstractfactory.product.topping.Sauce;

public abstract class BaseToppingFactory {

	public abstract Cheese createCheese();

	public abstract Sauce createSauce();
}
