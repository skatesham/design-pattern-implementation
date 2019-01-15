# State Pattern

State. Allows an object to alter its behavior when its internal state changes.

“Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.”

The best way to understand the State pattern is by an example. Let’s examine the State pattern through a candy vending machine example. The requirement of the vending machine is to roll out a candy whenever a user inserts a coin into the machine and presses a button. From this requirement, we can see that the machine will have four states: No Coin, Contains Coin, Dispense, and No Candy. These states represent different behavior of the machine. State transitions will move the machine from one state to another. As an example, if the current state of the machine is No Coin, and then a user enters a coin, a state transition will move the machine to the Contains Coin state. Here is how the state diagram of the candy vending machine looks like.

![alt text](https://springframework.guru/wp-content/uploads/2016/02/State_Diagram.jpg)

## Not Good Candy Machine code
A brittle class, this class are a [lasagna code](http://www.cs.brandeis.edu/~dkw/C-humor/pasta.txt), and if some extensions were implemented it would be a [spaghetti code jungle](https://en.wikipedia.org/wiki/Spaghetti_code) and a [Big Ball of Mud](https://blog.codinghorror.com/the-big-ball-of-mud-and-other-architectural-disasters/).

	
```
public class CandyVendingMachine {
    final static int NO_CANDY=0;
    final static int NO_COIN=1;
    final static int CONTAINS_COIN=2;
    final static int DISPENSE=3;
    int count;
    int state=NO_CANDY;
    public CandyVendingMachine(int numberOfCandies){
        count=numberOfCandies;
        if(count>0) state = NO_COIN;
    }
 
    public void insertCoin(){
        if(state==CONTAINS_COIN){
            System.out.println("Coin already inserted");
        }
        else if(state==NO_COIN){
            state=CONTAINS_COIN;
        }
        else if(state==NO_CANDY){
            System.out.println("No candies available");
        }
        else if(state==DISPENSE){
            System.out.println("Error. System is currently dispensing");
        }
    }
 
    public void pressButton(){
        if(state==CONTAINS_COIN){
            state=DISPENSE;
        }
        else if(state==NO_COIN){
            System.out.println("No coin inserted");
        }
        else if(state==NO_CANDY){
            System.out.println("No candies available");
        }
        else if(state==DISPENSE){
            System.out.println("No coin inserted");
        }
    }
 
    public void dispense(){
        if(state==CONTAINS_COIN){
            System.out.println("No candies rolled out");
        }
        else if(state==NO_COIN){
            System.out.println("No coin inserted");
        }
        else if(state==NO_CANDY){
            System.out.println("No candies available");
        }
        else if(state==DISPENSE){
            count=count-1;
            if(count==0){
               state=NO_CANDY;
            }
            else
                state=NO_COIN;
        }
    }
 
}
```
## Fixing
[Open Close principle](https://springframework.guru/principles-of-object-oriented-design/open-closed-principle/)  “Encapsulate what varies”


    Context (CandyVendingMachine): Provides and interface to client to perform some action and delegates state specific requests to the ConcreteState subclass that defines the current state.
    State (CandyVendingMachineState): Is an interface that encapsulates the behavior associated with a particular state of the Context.
    ConcreteState subclasses (NoCoinState, ContainsCoinState, DispensedState, and NoCandyState): Concrete classes that implements a behavior associated with a state of the Context.






