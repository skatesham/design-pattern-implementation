package creational.builder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import creational.builder.builder.ConcreteHouseBuilder;
import creational.builder.builder.ConstructionEngineer;
import creational.builder.builder.HouseBuilder;
import creational.builder.builder.PrefabricatedHouseBuilder;
import creational.builder.product.House;

public class ConstructionEngineerTest {

	@Test
	public void constructHouseTest() {

		House house;
		HouseBuilder houseBuilder;
		ConstructionEngineer engineer;

		houseBuilder = new ConcreteHouseBuilder();

		engineer = new ConstructionEngineer(houseBuilder);
		house = engineer.constructHouse();

		System.out.println("House is: " + house);
		System.out.println();

		houseBuilder = new PrefabricatedHouseBuilder();

		engineer = new ConstructionEngineer(houseBuilder);
		house = engineer.constructHouse();

		System.out.println("House is: " + house);
		System.out.println();

		assertTrue(true);

	}

}
