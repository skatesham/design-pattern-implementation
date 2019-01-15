# Strategy Pattern

Strategy. Allows one of a family of algorithms to be selected on-the-fly at run-time.

“Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.”


    Strategy (EncryptionStrategy): Is an interface common to all supported algorithm-specific classes.
    ConcreteStrategy (AesEncryptionStrategy and BlowfishEncryptionStrategy): Implements the algorithm using the Strategy interface.
    Context (Encryptor): Provides the interface to client for encrypting data. The Context maintains a reference to a Strategy object and is instantiated and initialized by clients with a ConcreteStrategy object.


## Not Good Implementation

```
public class Encryptor {
    private String algorithmName;
    private String plainText;
    public Encryptor(String algorithmName){
       this.algorithmName=algorithmName;
   }
    public void encrypt(){
        if (algorithmName.equals("Aes")){
            System.out.println("Encrypting data using AES algorithm");
            /*Code to encrypt data using AES algorithm*/
        }
       else if (algorithmName.equals("Blowfish")){
            System.out.println("Encrypting data using Blowfish algorithm");
            /*Code to encrypt data using Blowfish algorithm */
        }
        /*More else if statements for other encryption algorithms*/
    }
   /*Getter and setter methods for plainText*/
        
}
```

## Solution


    Strategy (EncryptionStrategy): Is an interface common to all supported algorithm-specific classes.
    ConcreteStrategy (AesEncryptionStrategy and BlowfishEncryptionStrategy): Implements the algorithm using the Strategy interface.
    Context (Encryptor): Provides the interface to client for encrypting data. The Context maintains a reference to a Strategy object and is instantiated and initialized by clients with a ConcreteStrategy object.

[Strategy Pattern](https://springframework.guru/gang-of-four-design-patterns/strategy-pattern/)
    
