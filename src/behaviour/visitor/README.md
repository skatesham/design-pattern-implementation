# Visitor Pattern

Visitor. Separates an algorithm from an object structure by moving the hierarchy of methods into one object.


![alt text](https://springframework.guru/wp-content/uploads/2016/02/Visiopr_Class_Diagram.png)


    Element (MailClient): Is an interface that contains a accept() method that takes a visitor as an argument.
    ConcreteElement (OperaMailClient, SquirrelMailClient, and ZimbraMailClient): Implements the accept() method declared in Element.
    Visitor (MailClientVisitor): Is an interface that declares a visit() method for each class of ConcreteElement in the object structure.
    ConcreteVisitor (MacMailClientVisitor, WindowsMailClientVisitor, and LinuxMailClientVisitor): Are the concrete classes that implements each method declared by Visitor.

Method Accept() with visit() uses [Double Dispatcher](https://en.wikipedia.org/wiki/Double_dispatch).    
