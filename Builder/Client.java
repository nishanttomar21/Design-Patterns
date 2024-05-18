// Eg: Build another class w/o creating its object
// Used when too many parameters to be passed to create an object, eg: configuration file
// The builder design pattern is a creational pattern that provides a flexible and controlled way to construct complex objects. It allows you to separate the object construction process from its representation.
// Benefits: Improved Readability, Immutable Objects, Step-by-Step Construction, Optional Parameters

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
