/**
Factory: Focuses on creating objects in factory class or factory method.
Strategy: Focuses on switching behavior dynamically and creating objects in the client or context.
Factory Design Pattern uses input to decide which object to create (based on a condition or input).
Strategy Design Pattern focuses on applying different behaviors (strategies) dynamically, but it doesn’t control or involve the creation of those behaviors. Creation of objects is done by the client.

Why PaymentContext Isn't Exactly a Factory
    In the example provided:

    PaymentContext is not responsible for creating instances of PaymentStrategy (like CreditCardPayment, PayPalPayment, etc.).
    The client code creates the appropriate PaymentStrategy object (e.g., new CreditCardPayment("1234")) and sets it in the PaymentContext using setPaymentStrategy().
    This differs from the Factory Design Pattern, where the factory is responsible for creating objects based on some input or configuration. In a factory, you wouldn't directly instantiate CreditCardPayment or PayPalPayment in the client code; instead, the factory would encapsulate the creation logic.

How It Could Look Like a Factory
    If we modified the PaymentContext to take input (like a type or string) and internally decide which PaymentStrategy to create, it would indeed resemble a factory pattern.

    Modified Example: PaymentContext as a Factory
        public class PaymentContext {
            private PaymentStrategy paymentStrategy;

            // Factory method inside the context
            public void setPaymentStrategy(String type) {
                paymentStrategy = switch (type.toLowerCase()) {
                    case "creditcard" -> new CreditCardPayment("1234567890123456");
                    case "paypal" -> new PayPalPayment("user@example.com");
                    case "upi" -> new UpiPayment("user@upi");
                    default -> throw new IllegalArgumentException("Invalid payment type");
                };
            }

            public void executePayment(double amount) {
                if (paymentStrategy == null) {
                    throw new IllegalStateException("Payment strategy is not set.");
                }
                paymentStrategy.pay(amount);
            }
        }

        // Client Code
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy("creditcard"); // Factory-like behavior
        context.executePayment(250.0);

    Here, the PaymentContext takes on a dual role:
        - It acts as a factory to create the PaymentStrategy.
        - It serves as the context to execute the strategy.

Key Difference in the Original Code
    In the original code:
        - PaymentContext does not decide which strategy to use or how to create it.
        - The client code explicitly creates and sets the strategy.
        - This aligns with the Strategy Pattern, where behavior (strategies) can be changed dynamically, but object creation isn't necessarily part of the pattern.

Takeaway
    - If PaymentContext were responsible for creating strategies based on input, then it would resemble the Factory Pattern.
    - In the current implementation, PaymentContext only uses the provided strategy, so it adheres to the Strategy Pattern.
    - Both patterns can overlap in implementation but are conceptually distinct:

When to Use
    Strategy Pattern
        - When you need to dynamically change the behavior of a class at runtime.
        - Example: A game character switches between different attack strategies (e.g., melee, ranged, or magic) during gameplay.
    Factory Pattern
        - When you want to centralize and simplify the object creation process.
        - Example: You need to create objects for different types of database connections (MySQL, PostgreSQL, etc.) based on configuration.

*/

// Eg: Birds using <<Flyable>> interface with functions because some bird can fly and some cannot
// Eg: Rainwater Question in DSA, 3 solutions possible (use 1 object for each solution to implement)
// Eg: GoogleMaps, options to find the distance - Car, Public transport, Walk, Bike (Below explanation)
// When there is more than 1 way to solve a problem, then don't use if-else statements, rather create object for each of the solution.
// Use Strategies - Factory (To avoid SRP & OCP => if-else), [Singleton + Registry(Hashmap)] => To remove if-else statements (removes OCP)
// The Strategy design pattern is a behavioural design pattern that enables selecting an algorithm's behavior at runtime. This pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. The Strategy pattern allows the algorithm to vary independently from the clients that use it.
// When to Use the Strategy Pattern:
    // When you have multiple related classes that differ only in their behaviour.
    // When you need different variants of an algorithm.
    // When you want to avoid conditional statements for selecting different behaviours.
    // When a class defines many behaviours, and these appear as multiple conditional statements in its operations.

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
     a. Runtime Algorithm Switching:
        - When you need to switch between different algorithms or behaviors at runtime.
     b. Multiple Variants of an Algorithm:
        - When you have multiple variants of an algorithm and want to make them interchangeable.
     c. Avoiding Conditional Statements:
        - To avoid complex conditional statements for selecting behavior.
     d. Isolating Algorithm Logic:
        - When you want to isolate the algorithm logic from the code that uses it.
     e. Client-Specified Behavior:
        - When you want clients to be able to specify or extend the algorithm's behavior.
     f. Behavior Parameterization:
         - When a class should be configured with one of many behaviors.

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

package Strategy;

public class Client {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card (The client explicitly decides the strategy and creates it`
        context.setPaymentStrategy(new CreditCardPayment("1234567890123456"));      // You already have the PaymentStrategy objects and dynamically change the behavior (e.g., paying via Credit Card or PayPal) at runtime.
        context.executePayment(250.0);  // Execution happens based on the behavior encapsulated in the strategy

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(150.0);

        // Pay using UPI
        context.setPaymentStrategy(new UpiPayment("user@upi"));
        context.executePayment(100.0);
    }
}
