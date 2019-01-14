package behaviour.Interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SubtractionExpression implements Expression {

	Expression firstExpression, secondExpression;

	@Override
	public int interpret() {
		return this.firstExpression.interpret() - this.secondExpression.interpret();
	}

	@Override
	public String toString() {
		return "-";
	}

}

