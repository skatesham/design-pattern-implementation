# Template Method Pattern

Template Method. Defines the skeleton of an algorithm as an abstract class, allowing its sub-classes to provide concrete behavior.

“Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.”

Template methods lead to an inverted control structure that’s sometimes referred to as the Hollywood principle that states “Don’t call us, we’ll call you“


    AbstractClass (PizzaMaker): Is an abstract class that contains a template method defining the skeleton of an algorithm. The template method calls methods to perform the steps of an algorithm. The methods can be both common across and specific to different algorithm implementations.
    ConcreteClass (VegPizzaMaker, NonVegPizzaMaker, and InHouseAssortedPizzaMaker): Are concrete subclasses of AbstractClass that implements the operations to carry out the algorithm-specific primitive steps.

## Description

The immediate next task is to identify the steps of the algorithm and distinguish the common and algorithm-specific steps. This is how the steps can be identified on a drawing board.

![alt text](https://springframework.guru/wp-content/uploads/2016/02/Pizza-Maker-Algorithm-Steps.png)

