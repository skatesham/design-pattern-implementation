package behaviour.mediator;

import org.junit.Test;

public class CommanderImplTest {

	@Test
	public void testMediator() {
		Commander commander = new CommanderImpl();
		ArmedUnit soldier = new SoldierUnit(commander);
		ArmedUnit tank = new TankUnit(commander);
		commander.registerArmedUnits(soldier, tank);
		commander.startAttack(tank);
		commander.startAttack(soldier);
		commander.ceaseAttack(tank);
		commander.startAttack(soldier);
	}

}
