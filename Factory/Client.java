// Eg: Flutter, React can write one code which runs on both Android and iOS
// Factory: The Factory design pattern is a creational pattern that focuses on providing an interface for creating objects in a superclass, while allowing subclasses to alter the type of objects that will be created. In simpler terms, it allows you to create objects without having to specify their exact class upfront.
// Abstract Factory: This defines the creation methods for the different product types. It might have methods like createProductA() or createProductB(). Subclasses implementing the factory can provide concrete implementations for these methods.
// Benefits: Decoupling Creation Logic, Flexibility in Object Creation, Promoting Reusability

package Factory;

import Factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
        Button b = uiComponentFactory.createButton();
        b.getSize();

        Platform p1 = new Platform();
        UIComponentFactory uiComponentFactory1 = p.createUIComponentFactory("Android");
        Button b1 = uiComponentFactory.createButton();
        b1.getSize();
//        if(p is a type of Android){
//            new AndroidButton;
//        }

    }
}
