package behaviour.mediator;

public class CommanderImpl implements Commander {
	
	ArmedUnit soldierUnit, tankUnit;
	boolean attackStatus = true;
	
	@Override
	public void registerArmedUnits(final ArmedUnit soldierUnit, final ArmedUnit tankUnit) {
		this.soldierUnit = soldierUnit;
		this.tankUnit = tankUnit;

	}

	@Override
	public void setAttackStatus(final boolean attackStatus) {
		this.attackStatus = attackStatus;

	}

	@Override
	public boolean canAttack() {
		return attackStatus;
	}

	@Override
	public void startAttack(final ArmedUnit armedUnit) {
		armedUnit.attack();
		
	}

	@Override
	public void ceaseAttack(final ArmedUnit armedUnit) {
		armedUnit.stopAttack();
	}

}
