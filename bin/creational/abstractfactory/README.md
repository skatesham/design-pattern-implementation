# Abstract Factory

Abstract Factory. Allows for the creation of objects without specifying their concrete type.
 

    AbstractProduct (Cheese and Sauce): Is an interface or an abstract class whose subclasses are instantiated by the abstract factory objects.
    ConcreteProduct (GoatCheese, MozzarellaCheese, TomatoSauce, and CaliforniaOilSauce): Are the concrete subclasses that implement/extend AbstractProduct. The abstract factory objects instantiate these subclasses.
    AbstractFactory (BaseToppingFactory): Is an interface or an abstract class whose subclasses instantiate a family of AbstractProduct objects.
    ConcreteFactory (SicillianToppingFactory and GourmetToppingFactory): Are the concrete subclasses that implement/extend AbstractFactory. An object of this subclass instantiates a family of AbstractProduct objects.
    Client: Uses AbstractFactory to get AbstractProduct objects.
  