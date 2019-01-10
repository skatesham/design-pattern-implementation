# Prototype

Prototype. Creates a new object from an existing object.


    Prototype (PrototypeCapableDocument): Is a Java interface or abstract class that defines the contract for classes that permits cloning of its objects.
    ConcretePrototype (TAndC and NDAgreement): Are classes that provide operations to clone its objects.
    PrototypeManager (DocumentPrototypeManager): A class that implements a registry to manage available prototypes for clients. On a client request, this class creates a copy of a prototype.
    Client: Asks the PrototypeManager for copies of prototypes.
