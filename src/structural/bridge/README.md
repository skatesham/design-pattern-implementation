# Bridge

Bridge. Decouples an abstraction so two classes can vary independently.

    Abstraction (Message): Is the interface implemented as an abstract class that clients communicates with.
    RefinedAbstraction (TextMessage and EmailMessage): Are classes that implement or extend Abstraction.
    Implementor (MessageSender): Is the interface of the implementation class hierarchy.
    ConcreteImplementor(TextMessageSender and EmailMessageSender): Are concrete subclasses that implements Implementor.


![alt text](https://springframework.guru/wp-content/uploads/2015/06/Bridge02-1024x380.png)