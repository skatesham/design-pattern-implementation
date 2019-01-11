package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

	private static Map<String, RaceCar> flyweights = new HashMap<>();

	public static RaceCar getRaceCar(final String key) {

		if (flyweights.containsKey(key))
			return flyweights.get(key);

		RaceCar raceCar;

		switch (key) {
		case "Midget":
			raceCar = new FlyweightMidgetCar("Midget Car", 140, 400);
			break;
		case "Sprint":
			raceCar = new FlyweightSprintCar("Sprint Car", 160, 1000);
			break;

		default:
			throw new IllegalArgumentException("Unsupported car type.");
		}
		flyweights.put(key, raceCar);

		return raceCar;
	}

}
