package structural.decorator;

public class OrchidBouquet extends FlowerBouquet {

	public OrchidBouquet() {
		this.description = "Orchid Flower";
	}
	
	@Override
	public double cost() {
		return 29.0;
	}

}
