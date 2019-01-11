package structural.decorator.decorators;

import structural.decorator.FlowerBouquet;
import structural.decorator.FlowerBouquetsDecorator;

public class RibbonBow extends FlowerBouquetsDecorator {

	FlowerBouquet flowerBouquet;

	public RibbonBow(final FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}

	@Override
	public String getDescription() {
		return flowerBouquet.getDescription() + ", RibbonBow";
	}

	@Override
	public double cost() {
		return 6.5 + flowerBouquet.cost();
	}

}
