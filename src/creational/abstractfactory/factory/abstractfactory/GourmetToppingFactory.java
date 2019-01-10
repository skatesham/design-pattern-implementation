package creational.abstractfactory.factory.abstractfactory;

import creational.abstractfactory.product.topping.CaliforniaOilSauce;
import creational.abstractfactory.product.topping.Cheese;
import creational.abstractfactory.product.topping.GoatCheese;
import creational.abstractfactory.product.topping.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory{

	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public Sauce createSauce() {
		return new CaliforniaOilSauce();
	}

}
