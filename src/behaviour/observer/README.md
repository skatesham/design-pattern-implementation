# Observer Pattern

Observer. Is a publish/subscribe pattern which allows a number of observer objects to see an event.

“Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.”

![alt text](https://springframework.guru/wp-content/uploads/2016/01/Observer.png)

    Subject (Subject interface): Provides an interface to attach and detach Observer objects.
    ConcreteSubject (Product class): Implements the Subject interface. A ConcreteSubject sends notification to Observer objects when its state change.
    Observer (Observer interface): Provides an interface for objects that should be notified of changes in a Subject.
    ConcreteObserver (Bidder class): Implements Observer to receive notifications from the Subject and keep its state consistent with the state of the Subject.
    
[More Information and how create your own custom event](https://springframework.guru/gang-of-four-design-patterns/observer-pattern/)
