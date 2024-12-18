// Eg: Build another class w/o creating its object
// Used when too many parameters to be passed to create an object, eg: configuration file
// The builder design pattern is a creational pattern that provides a flexible and controlled way to construct complex objects. It allows you to separate the object construction process from its representation.
// Benefits: Improved Readability, Immutable Objects, Step-by-Step Construction, Optional Parameters
// Key Characteristics of an Immutable Object
//      All Fields are Final: Fields in the target class are declared final to ensure they can only be assigned once.
//      No Setters: The target class does not provide any setter methods, preventing modification after the object is constructed.
//      Private Constructor: The constructor of the target class is private, ensuring that the object can only be instantiated through the Builder.
//      Builder Class: The Builder class sets all the necessary fields and then constructs the target class instance. After construction, the Builder is discarded, and no modifications can be made to the target class instance.
// Setters vs Builder Pattern
//      Feature	                    Setters	                                                        Builder Pattern
//      Mutability	                Object is mutable, can change values later	                    Object is immutable after creation.
//      Object Construction	        Object is created in multiple steps (constructor + setters)	    All steps are done in a single flow.
//      Readability	                Readability may reduce for many optional parameters.	        Fluent API makes object construction readable.
//      Thread-Safety	            Requires extra care for thread safety.	                        Easy to make thread-safe with immutable objects.
//      Validation	                Harder to enforce field validation.	                            Validation logic can be encapsulated in the build() method.
//      Large Constructors	        Solves the issue partially by reducing constructor parameters.	Completely avoids large constructors.

package Builder;

public class Client {
    public static void main(String[] args) {
        // Builder Design Pattern
        Student student = Student.getBuilder()
                            .setName("Nishant")
                            .setAge(28)
                            .setPsp(80.2)
                            .build();

        // Student student = new Student(builder);
        System.out.println("\nYES, Builder design pattern Implemented Successfully!!");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getPsp());
    }
}
