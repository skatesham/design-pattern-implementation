package behaviour.state;

public class NoCoinState implements CandyVendingMachineState {

	CandyVendingMachine machine;

	public NoCoinState(final CandyVendingMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		machine.setState(machine.getContainsCoinState());
	}

	@Override
	public void pressButton() {
		System.out.println("No coin inserted");
	}

	@Override
	public void dispense() {
		System.out.println("No coin inserted");
	}

	@Override
	public String toString() {
		return "NoCoinState";
	}

}
