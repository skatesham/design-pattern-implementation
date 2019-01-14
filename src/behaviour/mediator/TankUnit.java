package behaviour.mediator;

public class TankUnit implements ArmedUnit {

	private Commander commander;

	public TankUnit(final Commander commander) {
		this.commander = commander;
	}

	@Override
	public void attack() {
		if (commander.canAttack()) {
			System.out.println("TankUnit: Attacking.....");
			commander.setAttackStatus(false);
		} else {
			System.out.println("TankUnit: Cannot attack now. Other units attacking....");
		}
	}

	@Override
	public void stopAttack() {
		System.out.println("TankUnit: Stopped Attacking....");
		commander.setAttackStatus(true);
	}

}
