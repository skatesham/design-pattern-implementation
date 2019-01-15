package behaviour.state;

public class ContainsCoinState implements CandyVendingMachineState {

	CandyVendingMachine machine;

	public ContainsCoinState(final CandyVendingMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		System.out.println("Coin already inserted");

	}

	@Override
	public void pressButton() {
		machine.setState(machine.getDispendedState());

	}

	@Override
	public void dispense() {
		System.out.println("Press button to dispense");

	}

	@Override
	public String toString() {
		return "ContainsCoinState";
	}
}
