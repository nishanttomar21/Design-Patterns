// Registry: Saving all the templates/types of Bots
// The Registry design pattern is a structural pattern that provides a centralized place to store and access instances of classes or objects. This pattern is useful for managing a global object registry where objects can be retrieved by name or identifier. The Registry pattern helps avoid the problems associated with using global variables by providing a controlled access point for these objects.
// Benefits: Centralized Access, Controlled Global State, Decoupling

package PrototypeRegister;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>(); // Map<Type, Student>, type tells type of student which can be an enum {Average, Intelligent, Duffer}

    public void register(String key, Student value) {
        map.put(key, value);
    }

    public Student get(String key) {
        return map.get(key).clone();
    }

    // Prototype can be directly cloned in registry as well
//    public Student clone(StudentType type){ // Add type field in Student class as well
//        return map.get(type).cloneObject();
//    }
}


//public enum StudentType {
//    AVERAGE,
//    INTELLIGENT,
//    BELOW_AVERAGE,
//    POOR
//}
