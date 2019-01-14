# Mediator

Mediator. Allows loose coupling between classes by being the only class that has detailed knowledge of their methods.


    Mediator (Commander): Is an interface that declares methods for communicating with Colleague objects.
    ConcreteMediator (CommanderImpl): Implements Mediator. This class maintains and coordinates Colleague objects.
    Colleague(SoldierUnit and TankUnit): Communicates with its Mediator when their state changes and responds to requests from the Mediator.


![alt text](https://springframework.guru/wp-content/uploads/2015/11/Mediator.png)