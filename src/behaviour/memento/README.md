# Memento

Memento. Provides the ability to restore an object to its previous state.


    Originator (EmpOriginator): Is a class the state of whose object needs to be saved. It creates a Memento containing a snapshot of its current state. Originator uses the Memento to restore back its state.
    Memento (EmpMemento): Is a class whose objects stores states of the Originator. Memento denies other objects access to itself except the Originator.
    Caretaker (EmpCaretaker): Manages and safeguards Memento.


