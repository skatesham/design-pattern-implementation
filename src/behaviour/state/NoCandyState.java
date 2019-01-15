package behaviour.state;

public class NoCandyState implements CandyVendingMachineState {

	CandyVendingMachine machine;

	public NoCandyState(final CandyVendingMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		System.out.println("No candy available");

	}

	@Override
	public void pressButton() {
		System.out.println("No candy available");

	}

	@Override
	public void dispense() {
		System.out.println("No candy available");

	}
	
    @Override
    public String toString(){
        return "NoCandyState";
    }

}
