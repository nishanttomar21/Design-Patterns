// Registry: Saving all the templates/types of Bots
// The Registry design pattern is a structural pattern that provides a centralized place to store and access instances of classes or objects. This pattern is useful for managing a global object registry where objects can be retrieved by name or identifier. The Registry pattern helps avoid the problems associated with using global variables by providing a controlled access point for these objects.
// Benefits: Centralized Access, Controlled Global State, Decoupling

package PrototypeRegister;

import java.util.HashMap;
import java.util.Map;

public class BotRegistry {
    private final Map<String, Bot<?>> botMap = new HashMap<>();

    /**
     * "extends" is used to restrict the type of T to a specific type or its subclasses (upper bound)
     * "?" is a wildcard and means "any type." It ensures flexibility by allowing Bot with any generic type parameter (e.g., Bot<WarriorBot>, Bot<MedicBot>)
     * "Bot<?>" specifies that T must be a type that implements or extends Bot, with any type parameter (indicated by ?)
     * <T extends Bot<?>>: The type parameter T must be a subtype of Bot<?>
     */
    public <T extends Bot<?>> void registerBot(String botType, T botObject) {
        botMap.put(botType, botObject);
    }

    @SuppressWarnings("unchecked")
    public <T extends Bot<?>> T createBot(String name) {    // T is a method-level type parameter (locally visible to method). It is a placeholder for the actual type that will be used at runtime.
          Bot<?> bot =  botMap.get(name);   // Bot<?> means "a Bot with any type parameter." Problem with Bot<T>: T is not globally known

          if (bot == null)
              return null;
          else {
              return (T) bot.cloneBot();    // The cast (T) is necessary because we’re dealing with Bot<?>, a generic type, and we need to cast it back to the correct type (T), which is determined at runtime when the method is invoked.
          }
    }
}
