package structural.flyweight;

public class FlyweightSprintCar extends RaceCar {

	public FlyweightSprintCar(final String name, final int speed, final int horsepower) {
		super(name, speed, horsepower);
		num++;
	}

	public static int num = 0;

	@Override
	public void moveCar(final int currentX, final int currentY, final int newX, final int newY) {
		System.out.println("New location of " + this.getName() + " is X" + newX + " - Y" + newY);

	}

}
