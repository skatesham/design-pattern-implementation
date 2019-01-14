package behaviour.mediator;

public interface Commander {

	void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tank);

	void setAttackStatus(boolean attackStatus);

	boolean canAttack();

	void startAttack(ArmedUnit armedUnit);

	void ceaseAttack(ArmedUnit armedUnit);

}
