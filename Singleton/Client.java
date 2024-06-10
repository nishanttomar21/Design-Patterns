// Eg: Object creation is very costly --> db connection, file initialisation, logging
// The Singleton design pattern is a Creational pattern that ensures a class has only one instance and provides a global access point to that instance. It's a widely used pattern, but also one that can be controversial due to potential downsides.
// Benefits: Global Access Point, Enforced Single Instance, Controlled Instantiation
// Drawbacks: Tight Coupling, Testability Issues, Limited Flexibility
// Methods to Break Singleton Pattern
//      Reflection: Can break Singleton by accessing private constructor. Fix by throwing an exception in the constructor.
//      Serialization: Can break Singleton by creating new instances during deserialization. Fix by implementing readResolve.
//      Cloning: Can break Singleton by creating a clone. Fix by overriding clone method.
//      Multithreading: Can break Singleton by creating multiple instances. Fix by using synchronization or Bill Pugh Singleton Design.

package Singleton;

public class Client {
    public static void main(String[] args) {
        // Singleton Design Pattern
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2)
            System.out.println("\nYES, Singleton design pattern Implemented Successfully!!");
    }
}
