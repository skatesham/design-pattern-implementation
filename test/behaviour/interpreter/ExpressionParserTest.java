package behaviour.interpreter;

import org.junit.Test;

import behaviour.Interpreter.ExpressionParser;

public class ExpressionParserTest {

	@Test
	public void parseTest() {
		String input = "2 1 5 + *";
		ExpressionParser expressionParser = new ExpressionParser();
		System.out.println("2 1 5 + *");
		int result = expressionParser.parse(input);

		System.out.println("Final result: " + result);
		System.out.println();
		input = "3 11 5 + -";

		System.out.println("3 11 5 + -");
		result = expressionParser.parse(input);

		System.out.println("Final result: " + result);
	}

}
