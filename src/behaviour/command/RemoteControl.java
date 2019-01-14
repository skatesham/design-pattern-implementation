package behaviour.command;

public class RemoteControl {

	private CommandBase onCommand, offCommand, undoCommand;

	public void onButtonPressed(final CommandBase onCommand) {
		this.onCommand = onCommand;
		onCommand.execute();
		undoCommand = this.onCommand;
	}

	public void offButtonPressed(final CommandBase offCommand) {
		this.offCommand = offCommand;
		offCommand.execute();
		undoCommand = this.offCommand;
	}

	public void undoButtonPressed() {
		undoCommand.undo();
	}
}
