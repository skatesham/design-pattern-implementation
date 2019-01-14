# Chain of Responsability

Chain of Responsibility. Delegates commands to a chain of processing objects.


    Handler (AbstractSupportHandler) Abstract base class acting as the interface to handle request. Optionally, but most often the Handler implements the chain links.
    ConcreteHandler (TechnicalSupportHandler, BillingSupportHandler, and GeneralSupportHandler.) Handles request, else passes it to the next successor of the handler chain
    Client(RequestorClient): Initiates a request that one of the chain of handlers ( a ConcreteHandler) handles


![alt text](https://springframework.guru/wp-content/uploads/2015/09/01.png)