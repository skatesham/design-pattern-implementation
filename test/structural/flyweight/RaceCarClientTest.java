package structural.flyweight;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RaceCarClientTest {

	@Test
	public void raceCarTest() {

		RaceCarClient raceCars[] = {

				new RaceCarClient("Midget"), new RaceCarClient("Midget"), new RaceCarClient("Midget"),
				new RaceCarClient("Sprint"), new RaceCarClient("Sprint"), new RaceCarClient("Sprint")

		};

		raceCars[0].moveCar(29, 3112);
		raceCars[1].moveCar(39, 2002);
		raceCars[2].moveCar(49, 1985);
		raceCars[3].moveCar(59, 2543);
		raceCars[4].moveCar(69, 2322);
		raceCars[5].moveCar(79, 2135);

		/* Output and observe the number of instances created */
		System.out.println("Midget Car Instances: " + FlyweightMidgetCar.num);
		System.out.println("Sprint Car Instances: " + FlyweightSprintCar.num);

		assertTrue(true);

	}

}
