// Eg: Object creation is very costly --> db connection, file initialisation, logging
// The Singleton design pattern is a Creational pattern that ensures a class has only one instance and provides a global access point to that instance. It's a widely used pattern, but also one that can be controversial due to potential downsides.
// Benefits: Global Access Point, Enforced Single Instance, Controlled Instantiation
// Drawbacks: Tight Coupling, Testability Issues, Limited Flexibility

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
