package structural.flyweight;

public class FlyweightMidgetCar extends RaceCar{

	public static int num = 0;
	
	public FlyweightMidgetCar() {
		num++;
	}
	
	@Override
	public void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New location of "+this.getName()+" is X"+newX + " - Y"+newY);
		
	}

}
