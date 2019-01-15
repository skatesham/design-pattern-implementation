package behaviour.state;

import org.junit.Test;

public class CandyMachineTest {

	@Test
	public void CandyVendingMachineTest() {
		System.out.println("-----Test 1: Testing machine by inserting coin and pressing button-----");
		CandyVendingMachine machine = new CandyVendingMachine(3);
		System.out.println(machine);
		machine.insertCoin();
		System.out.println(machine);
		machine.pressButton();
		System.out.println(machine);

		System.out.println("-----Test 2: Testing machine by pressing button without inserting coin-----");
		CandyVendingMachine machine2 = new CandyVendingMachine(3);
		System.out.println(machine2);
		machine2.pressButton();
		System.out.println(machine2);

		System.out.println("-----Test 3: Testing machine running out of candies-----");
		CandyVendingMachine machine3 = new CandyVendingMachine(3);
		System.out.println(machine3);
		// 3 candy count
		machine3.insertCoin();
		machine3.pressButton();
		// 2 candy count
		machine3.insertCoin();
		machine3.pressButton();
		// 1 candy count
		machine3.insertCoin();
		machine3.pressButton();
		// 0 candy count
		machine3.insertCoin();
		machine3.pressButton();
		System.out.println(machine3);
		// +1 candy count
		machine3.refillCandy(1);
		System.out.println(machine3);
		// 0 candy count
		machine3.insertCoin();
		machine3.pressButton();
		System.out.println(machine3);
	}
}
