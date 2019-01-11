package structural.flyweight;

public class RaceCarClient {

	private RaceCar raceCar;

	public RaceCarClient(final String name) {
		raceCar = CarFactory.getRaceCar(name);
	}

	/**
	 * The extrinsic state of the flyweight is maintained by the client
	 */
	private int currentX = 0;
	private int currentY = 0;

	public void moveCar(final int newX, final int newY) {
		
		/*Car movement is handled by the flyweight object*/
		raceCar.moveCar(currentX, currentY, newX, newY);
	}

}
