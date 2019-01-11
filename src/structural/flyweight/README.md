# Flyweight

Flyweight. Reduces the cost of complex object models.


    Flyweight (RaceCar): Abstract class or interface for flyweight objects. Declares method through which flyweights can receive and act on extrinsic state. Although Flyweight enables sharing, it is not mandatory that all Flyweight subclasses must be shared.
    ConcreteFlyweight(FlyweightMidgetCar and FlyweightSprintCar): Extends/Implements Flyweight to represent flyweight objects that can be shared.
    FlyweightFactory(CarFactory): Creates and manages flyweight objects. When a client requests a flyweight object, FlyweightFactory provides an existing one or creates a new one, if it does not exists.
    Client(RaceCarClient): Requests FlyweightFactory for a flyweight object, and then computes and passes the extrinsic data to it.
