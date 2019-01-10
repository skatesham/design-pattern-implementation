# Adapter

Adapter. Allows for two incompatible classes to work together by wrapping an interface around one of the existing classes.


    Target (TextFormattable): The existing interface that clients communicate with.
    Adaptee (CsvFormattable): The new incompatible interface that needs adapting.
    Adapter (CsvAdapterImpl): A class that adapts the Adaptee to the Target.
    Client: Communicates with the Target.

![alt text](https://springframework.guru/wp-content/uploads/2015/06/adapter-plugs-radio-shack-300x225.jpg)