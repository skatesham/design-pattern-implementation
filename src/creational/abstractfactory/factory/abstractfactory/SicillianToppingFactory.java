package creational.abstractfactory.factory.abstractfactory;

import creational.abstractfactory.product.topping.Cheese;
import creational.abstractfactory.product.topping.MozzarellaCheese;
import creational.abstractfactory.product.topping.Sauce;
import creational.abstractfactory.product.topping.TomatoSauce;

public class SicillianToppingFactory extends BaseToppingFactory {

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

}
