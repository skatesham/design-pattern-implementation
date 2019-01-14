package behaviour.Interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NumberEmpression implements Expression {

	private int number;

	public NumberEmpression(final String number) {
		super();
		this.number = Integer.parseInt(number);
	}

	@Override
	public int interpret() {
		return this.number;
	}

}
