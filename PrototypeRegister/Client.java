// Eg: Bots - Types (Man, Animal, Rocket shape), Display only 1 3BHK prototype for show and not the complete building
// Create the multiple new objects in abundance by copying the already created prototype. Make 1 then copy/clone that multiple times
// Registry: Saving all the templates/types of Bots
// The Prototype design pattern is a creational pattern that focuses on creating new objects by cloning existing objects instead of starting from scratch. It provides a mechanism to copy an object's state efficiently, promoting performance and reducing code complexity.
// Benefits: Improved Performance, Reduced Memory Consumption, Simplified Object Creation

package PrototypeRegister;

public class Client {
    public static void main(String[] args) {
        // Prototype
        Student s1 = new Student();
        s1.setName("Nishant Tomar");
        s1.setId(101);
        s1.setPsp(80.2);
        s1.setBatch("April'23");

        Student s2 = s1.clone();

        System.out.println();
        System.out.println(s2.getName());
        System.out.println(s2.getId());
        System.out.println(s2.getBatch());
        System.out.println(s2.getPsp());

        Student s3 = new IntelligentStudent();
        s3.setName("Megha Singh");
        s3.setId(102);
        s3.setPsp(90.8);
        s3.setBatch("March'23");
        //s3.setIq(100); // Compile time error

        Student s4 = s3.clone();

        System.out.println();
        //System.out.println(s4.getIq()); // Compile time error
        System.out.println(s4.getName());
        System.out.println(s4.getId());
        System.out.println(s4.getBatch());
        System.out.println(s4.getPsp());

        // Registry (Register templates of prototype)
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register("s1", s1);
        studentRegistry.register("s3", s3);

        Student s5 = studentRegistry.get("s1");
        System.out.println();
        System.out.println(s5.getName());
        System.out.println(s5.getId());
        System.out.println(s5.getBatch());
        System.out.println(s5.getPsp());

        if (s1 != s5)
            System.out.println("\nNew copy object created successfully!!");
    }
}
