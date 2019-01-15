package behaviour.state;

public class DispensedState implements CandyVendingMachineState {

	CandyVendingMachine machine;

	public DispensedState(final CandyVendingMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		System.out.println("Error. System is currently dispensing");

	}

	@Override
	public void pressButton() {
		System.out.println("Error. System is currently dispensing");

	}

	@Override
	public void dispense() {
		if (machine.getCount() > 0) {
			machine.setState(machine.getNoCoinState());
			machine.ejectCandy();
			System.out.println("*****ENJOY OR CANDY!*****");
		} else {
			System.out.println("No candy available");
			machine.setState(machine.getNoCandyState());
		}

	}

	@Override
	public String toString() {
		return "DispensedState";
	}
}
