package creational.builder.builder;

import creational.builder.product.House;

public interface HouseBuilder {

	void buildFoundation();

	void buildStructure();

	void buildRoof();

	void paintHouse();

	void furnishHouse();

	House getHouse();

}
