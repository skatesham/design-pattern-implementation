package behaviour.Interpreter;

public class ParserUtil {

	public static boolean isOperator(final String symbol) {
		return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*"));
	}
	
	public static Expression getExpressionObject(final Expression firstExpression, final Expression secondExpression, final String symbol) {
		if(symbol.equals("+"))
			return new AdditionExpression(firstExpression, secondExpression);
		else if(symbol.equals("-"))
			return new SubtractionExpression(firstExpression, secondExpression);
		else
			return new MultiplicationExpression(firstExpression, secondExpression);
	}

}
