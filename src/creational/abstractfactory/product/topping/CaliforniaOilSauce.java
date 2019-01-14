package creational.abstractfactory.product.topping;

public class CaliforniaOilSauce implements Sauce {

	public CaliforniaOilSauce() {
		prepareSauce();
	}

	@Override
	public void prepareSauce() {
		System.out.println("Preparing California Oil Sauce...");
	}

}
