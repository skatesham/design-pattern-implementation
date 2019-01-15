package behaviour.templatemethod;

public abstract class PizzaMaker {

	public void makePizza() {
		preparePizzaDough();
		preBakeCrust();
		prepareIngredients();
		addToppings();
		bakePizza();
		if (customerWantsPackedPizza()) {
			packPizza();
		}
	}

	// wont change
	final void preparePizzaDough() {
		System.out.println(
				"Preparing pizza dough with plain flour, dried yeast, caster sugar, salt, olive oil, and warm water.");
	}
	
	// wont change
	final void preBakeCrust() {
		System.out.println("Pre baking crust at 325 F for 3 minutes.");
	}

	abstract void prepareIngredients();

	abstract void addToppings();

	void bakePizza() {
		System.out.println("Baking pizza at 400 F for 12 minutes.");
	}

	void packPizza() {
		System.out.println("Packing pizza in pizza delivery box.");
	}

	boolean customerWantsPackedPizza() {
		return true;
	}

}
