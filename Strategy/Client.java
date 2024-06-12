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

package Strategy;

public class Client {
}
