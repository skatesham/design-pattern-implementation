package behaviour.command;

public class CarStopCommand implements CommandBase {
	private Car car;

	public CarStopCommand(final Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		System.out.println("CarStopCommand.execute(): Invoking stop() on Car");
		car.stop();
	}

	@Override
	public void undo() {
		System.out.println("CarStopCommand.undo(): Undoing previous action-> Invoking move() on Car");
		car.move();
	}
}
