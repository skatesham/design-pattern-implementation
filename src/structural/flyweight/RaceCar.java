package structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class RaceCar {

	/* Intrinsic state stored and shared in the Flyweight object */
	private String name;
	private int speed;
	private int horsepower;

	/*
	 * Extrinsic state is stored or computed by client objects, and passed to the
	 * Flyweight.
	 */
	public abstract void moveCar(int currentX, int currentY, int newX, int newY);
	
}
