package behaviour.command;

public class CarMoveCommand implements CommandBase {

	private Car car;

	public CarMoveCommand(final Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		System.out.println("CarMoveCommand.execute(): Invoking move() on Car");
		this.car.move();
	}

	@Override
	public void undo() {
		System.out.println("CarMoveCommand.undo():  Undoing previous action->Invoking stop() on Car");
		this.car.stop();
	}

}
