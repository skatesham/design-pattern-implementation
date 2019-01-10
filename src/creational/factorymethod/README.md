# Factory Method

Factory Method. Creates objects without specifying the exact class to create.


    Product (Pizza): Is an interface or an abstract class whose subclasses are instantiated by the factory method.
    ConcreteProduct (CheesePizza, PepperoniPizza, and VeggiePizza): Are the concrete subclasses that implement/extend Product. The factory method instantiates these subclasses.
    Creator (BasePizzaFactory): Is an interface or an abstract class that declares the factory method, which returns an object of type Product.
    ConcreteCreator (PizzaFactory): Is a concrete class that implements the factory method to create and return a ConcreteProduct to Client.
    Client: Asks the Creator for a Product.