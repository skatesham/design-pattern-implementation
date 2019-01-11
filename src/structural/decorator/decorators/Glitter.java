package structural.decorator.decorators;

import structural.decorator.FlowerBouquet;
import structural.decorator.FlowerBouquetsDecorator;

public class Glitter extends FlowerBouquetsDecorator {

	FlowerBouquet flowerBouquet;

	public Glitter(final FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}

	@Override
	public String getDescription() {
		return flowerBouquet.getDescription() + ", Glitter";
	}

	@Override
	public double cost() {
		return 4 + flowerBouquet.cost();
	}

}
