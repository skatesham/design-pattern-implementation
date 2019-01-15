package behaviour.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CandyVendingMachine {

	private int count;
	private CandyVendingMachineState noCoinState;
	private CandyVendingMachineState noCandyState;
	private CandyVendingMachineState dispendedState;
	private CandyVendingMachineState containsCoinState;
	private CandyVendingMachineState state;

	public CandyVendingMachine(final int numberOfCandies) {
		this.count = numberOfCandies;
		noCoinState = new NoCoinState(this);
		noCandyState = new NoCandyState(this);
		dispendedState = new DispensedState(this);
		containsCoinState = new ContainsCoinState(this);
		state = noCoinState;
	}

	public void refillCandy(final int count) {
		this.count += count;
		this.state = this.noCoinState;
	}

	public void ejectCandy() {
		if (count != 0) {
			count--;
		}
	}

	public void insertCoin() {
		System.out.println("You inserted a coin.");
		state.insertCoin();
	}

	public void pressButton() {
		System.out.println("You have pressed the button.");
		state.pressButton();
		state.dispense();
	}

	@Override
	public String toString() {
		String machineDef = "Current state of machine " + state + ". Candies available " + count;
		return machineDef;
	}

}
