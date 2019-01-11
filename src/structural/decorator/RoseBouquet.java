package structural.decorator;

public class RoseBouquet extends FlowerBouquet {

	public RoseBouquet() {
		this.description = "Rose Flower";
	}

	@Override
	public double cost() {
		return 12;
	}

}
