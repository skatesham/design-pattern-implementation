package creational.builder.builder;

import creational.builder.product.House;

public class ConstructionEngineer {

	HouseBuilder houseBuilder;

	public ConstructionEngineer(HouseBuilder houseBuilder) {
		super();
		this.houseBuilder = houseBuilder;
	}

	public House constructHouse() {

		this.houseBuilder.buildFoundation();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildRoof();
		this.houseBuilder.paintHouse();
		this.houseBuilder.furnishHouse();
		return this.houseBuilder.getHouse();
	}

}
