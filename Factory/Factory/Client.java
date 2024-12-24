/*
Feature	                Factory Pattern	                                        Abstract Factory Pattern
Purpose	                Creates objects of one type or family.	                Creates families of related or dependent objects.
Complexity	            Simpler and easier to implement.	                    More complex, involves multiple factories (multiple factory methods).
Number of Factories	    Single factory class or method.	                        Multiple factory classes for different families.
Extensibility	        Less extensible if new product families are added.	    Easily extensible for new families of products.
Example Use Case	    Shape creation (Circle, Square, etc.).	                GUI creation for different platforms.
*/



package Factory.Factory;

public class Client {
    public static void main(String[] args) {
        Database database = DatabaseFactory.getDatabase("MySQL");      // Can pass user input here as well
        database.connect();
    }
}
