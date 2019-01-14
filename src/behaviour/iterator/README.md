# Iterator

Iterator. Accesses the elements of an object sequentially without exposing its underlying representation.


    Aggregate (PatternAggregate): Is an interface that declares the methods to create and return an iterator.
    ConcreteAggregate (PatternAggregateImpl): Is a concrete class that implements the Aggregate interface to create and return an iterator.
    Iterator (PatternIterator): Is an interface with methods to allow clients to access and traverse elements.
    ConcreteIterator (PatternIteratorImpl): Is a concrete class that implements the Iterator interface. Objects of this class keeps track of the elements and implements access and traversal operations on the elements.
