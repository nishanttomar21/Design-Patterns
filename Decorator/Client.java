// Eg: Coffee House (Customise coffee with multiple add-on options and get it bill)
// The decorator design pattern is a structural pattern that allows you to attach additional functionalities to an object dynamically, without altering its original structure. It provides a flexible alternative to subclassing for extending object behavior.
// Intent:
    // Add new responsibilities to objects at runtime.
    // Provide a flexible alternative to subclassing for extending functionality.
    // Promote loose coupling between objects by separating concerns.
// Benefits: Runtime Flexibility, Maintainability, Open/Closed Principle

package Decorator;

import Decorator.addons.Milk;
import Decorator.addons.Whip;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Espresso();
        b.getCost();

        // Espresso with WHip and Milk
        Beverage cb = new Espresso();
        cb = new Whip(cb);
        cb = new Milk(cb);
        System.out.println(cb.getCost());
    }
}
