/*
    Eg: Flutter & React can write one code which runs on both Android and iOS (Cross Platform UI Framework)
    Factory: The Factory design pattern is a creational pattern that focuses on providing an interface for creating objects in a superclass, while allowing subclasses to alter the type of objects that will be created. In simpler terms, it allows you to create objects without having to specify their exact class upfront.
    Abstract Factory: This defines the creation methods for the different product types. It might have methods like createProductA() or createProductB(). Subclasses implementing the factory can provide concrete implementations for these methods.
    Benefits: Decoupling Creation Logic, Flexibility in Object Creation, Promoting Reusability
    It's used when there is SRP/OCP violation
    Eg: Audio Formats - MP3, WAV, and FLAC; Type of Notifications - Email, SMS, push;

    Abstract Factory Design Pattern
        Purpose:
            The Abstract Factory Pattern provides a way to create families of related or dependent objects without specifying their concrete classes.

        Key Characteristics:
            Supports multiple product families.
            Abstract Factory defines an interface for creating each type of object in the family.
            More complex and extensible than the Factory Pattern.
        Example Use Case:
            Creating GUI components for different operating systems (e.g., Windows, MacOS) where each family includes related components like Buttons and Checkboxes.
*/

/**
 A. TODO [Strategy design pattern vs Factory design pattern]:

     1. Strategy Design Pattern:
         Purpose: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
         Use case: When you want to use different variants of an algorithm within an object and be able to switch between them dynamically.
         Structure: Typically involves an interface or abstract class defining the algorithm, with concrete classes implementing the specific variations.

     2. Factory Design Pattern:
        Purpose: Provides an interface for creating objects in a superclass, allowing subclasses to decide which class to instantiate.
         Use case: When a class can't anticipate the type of objects it needs to create, or when a class wants its subclasses to specify the objects it creates.
         Structure: Usually involves a creator class with a factory method, and concrete creator subclasses that override this method to produce specific product objects.

     Key differences:
         Intent: Strategy is about changing behavior, while Factory is about object creation.
         Flexibility: Strategy allows switching algorithms at runtime, Factory determines object type at creation time. While the Factory pattern can be part of a solution for runtime algorithm switching, it's not its primary purpose. The Strategy pattern is more directly suited for that specific need.
         Relationship: Strategy deals with how something is done, Factory deals with what is being created.

 B. TODO [Does factory design pattern allows switching algorithms at runtime]:

    The Factory design pattern itself does not directly allow switching algorithms at runtime. However, it can be used as part of a system that enables runtime algorithm switching. Let me clarify this:

     1. Factory Pattern's Primary Purpose: The Factory pattern is primarily about object creation. It encapsulates the logic for creating objects of different types, but once an object is created, its behavior is typically fixed.
     2. Static vs. Runtime Decision: In a basic implementation, the decision about which concrete class to instantiate is often made at compile-time or based on configuration, not dynamically at runtime.
     3. Potential for Runtime Flexibility: That said, you can design a system using the Factory pattern that allows for some runtime flexibility:
         - You could have a configurable Factory that reads from a configuration file or database to determine which class to instantiate.
         - You could implement a Factory that takes runtime parameters to decide which object to create.
     4. Combination with Other Patterns: To achieve runtime algorithm switching, the Factory pattern is often used in conjunction with other patterns:
         - Strategy Pattern: Use a Factory to create different Strategy objects.
         - Dependency Injection: Inject different Factory implementations at runtime.

 C. TODO [Factory, Strategy Design use cases]:

     1. Factory Design Pattern:
         a. Object Creation Complexity:
             - When the process of creating an object is complex or requires specific logic.
             - When you want to centralize object creation logic to avoid duplication.
     b. Decoupling:
         - To decouple the client code from the concrete classes it uses.
         - When a class can't anticipate the type of objects it needs to create.
     c. Family of Related Objects:
        - When you have a family of related products or objects that you need to create.
     d. Extensibility:
        - When you want to allow for easy extension of your product catalog without modifying existing code.
     e. Configuration or Environment-Dependent Object Creation:
        - When object creation depends on certain configurations or environment settings.

     Example scenarios:
         - Creating different types of database connections based on configuration.
         - Instantiating appropriate UI elements for different operating systems.
         - Creating different types of documents in a document processing application.

     2. Strategy Design Pattern:
         a. Runtime Algorithm Switching: When you need to switch between different algorithms or behaviors at runtime.
         b. Multiple Variants of an Algorithm: When you have multiple variants of an algorithm and want to make them interchangeable.
         c. Avoiding Conditional Statements: To avoid complex conditional statements for selecting behavior.
         d. Isolating Algorithm Logic: When you want to isolate the algorithm logic from the code that uses it.
         e. Client-Specified Behavior: When you want clients to be able to specify or extend the algorithm's behavior.
         f. Behavior Parameterization: When a class should be configured with one of many behaviors.

     Example scenarios:
         - [Remember] Implementing payment service with multiple payment gateways.
         - Implementing different sorting algorithms that can be switched at runtime.
         - Applying various discount calculation strategies in an e-commerce system.
         - Implementing different navigation algorithms in a GPS application.

     Key Differences in Usage:
         a. Creation vs. Behavior:
             - Factory is about creating objects.
             - Strategy is about defining and switching between different behaviors.
         b. When They're Set:
             - Factory typically determines the type of object at creation time.
             - Strategy allows for switching behavior throughout the object's lifetime.
         c. Flexibility:
             - Factory provides flexibility in terms of what is created.
             - Strategy provides flexibility in terms of how something is done.
         d. Intent:
             - Factory aims to create objects without specifying their exact classes.
             - Strategy aims to define a family of algorithms, encapsulate each one, and make them interchangeable.

     In practice, these patterns can be used together. For example, you might use a Factory to create different Strategy objects, combining the benefits of both patterns.

     Payment Service Implementation:
         Factory - To create different payment gateways objects based on a value passed from client
         Strategy (Used everywhere) - To create different payment gateways objects based on a complex algorithm/strategy and not a value passed from client

 */

package Factory.AbstractFactory;


import Factory.AbstractFactory.DatabaseConnection.Database;
import Factory.AbstractFactory.QueryExecutor.Query;

public class Client {
    // Factory selection logic (can also make a separate FactorySelector class called super factory class)
    public static AbstractFactory getFactory(String dbType) {
        if (dbType.equalsIgnoreCase("MySQL")) {
            return new MySqlFactory();
        } else if (dbType.equalsIgnoreCase("PostgreSQL")) {
            return new PostgreSqlFactory();
        } else if (dbType.equalsIgnoreCase("SQLite")) {
            return new MongoDbFactory();
        } else {
            return null; // Unknown database type
        }
    }

    public static void main(String[] args) {
        AbstractFactory factory = getFactory("MySQL");  // Use Registry Design Pattern here to remove OCP violation (Reference: AnotherExample3.txt)

        // Use the factory to create related objects
        Database db = factory.createDatabase();
        Query query = factory.createQuery();

        // Connect to the database and execute a query
        db.connect();
        query.executeQuery();
    }
}
