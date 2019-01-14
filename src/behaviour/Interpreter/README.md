# Interpreter

Interpreter. Implements a specialized language.

When we are talking about input expressions, you can relate them with mathematical expressions that follows one of the notation, such as Reverse Polish Notation (RPN) (Postfix) in which every operator follows all of its operands. An example of an expression with Postfix notation is 2 1 5 + *, which the Java compiler will interpret as 2*1+5 that will result into 12.

[RPN PostFix](https://www.meta-calculator.com/learning-lab/rpn-reverse-polish-notation-explained.php)

![alt text](https://springframework.guru/wp-content/uploads/2015/11/Interpreter01.png)


    AbstractExpression (Expression): Declares an interpret() operation that all nodes (terminal and nonterminal) in the AST overrides.
    TerminalExpression (NumberExpression): Implements the interpret() operation for terminal expressions.
    NonterminalExpression (AdditionExpression, SubtractionExpression, and MultiplicationExpression): Implements the interpret() operation for all nonterminal expressions.
    Context (String): Contains information that is global to the interpreter. It is this String expression with the Postfix notation that has to be interpreted and parsed.
    Client (ExpressionParser): Builds (or is provided) the AST assembled from TerminalExpression and NonTerminalExpression. The Client invokes the interpret() operation.

![alt text](https://springframework.guru/wp-content/uploads/2015/11/Interpreter.jpg)

“If a particular kind of problem occurs often enough, then it might be worthwhile to express instances of the problem as sentences in a simple language. Then you can build an interpreter that solves the problem by interpreting these sentences. For example, searching for strings that match a pattern is a common problem. Regular expressions are a standard language for specifying patterns of strings. Rather than building custom algorithms to match each pattern against strings, search algorithms could interpret a regular expression that specifies a set of strings to match”
