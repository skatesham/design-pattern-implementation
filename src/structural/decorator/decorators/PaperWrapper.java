package structural.decorator.decorators;

import structural.decorator.FlowerBouquet;
import structural.decorator.FlowerBouquetsDecorator;

public class PaperWrapper extends FlowerBouquetsDecorator {

	FlowerBouquet flowerBouquet;

	public PaperWrapper(FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}

	@Override
	public String getDescription() {
		return flowerBouquet.getDescription() + ", PaperWrapper";
	}

	@Override
	public double cost() {
		return 3 + flowerBouquet.cost();
	}

}
