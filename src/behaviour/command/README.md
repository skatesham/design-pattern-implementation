# Command

Command. Creates objects which encapsulate actions and parameters.


    Command (CommandBase): Is an interface for executing an action.
    ConcreteCommand (CarMoveCommand, CarStopCommand, TopRotateCommand, and TopStopRotateCommand): Are concrete classes that implements Command and defines the execute() and undo() methods to communicate with receivers for performing an action and undoing it respectively.
    Invoker(RemoteControl): Asks Command to carry out the action.
    Receiver (Car and RotatingTop): Performs the action based on the command it receives.
    Client: Creates a ConcreteCommand object and sets its receiver.
