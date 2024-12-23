// Eg: Bots - Types (Man, Animal, Alien shape), Display only 1 3BHK prototype for show and not the complete building of flats
// Create the multiple new objects in abundance by copying the already created prototype. Make 1 then copy/clone that multiple times
// Registry: Saving all the templates/types of Bots
// The Prototype design pattern is a creational pattern that focuses on creating new objects by cloning existing objects instead of starting from scratch. It provides a mechanism to copy an object's state efficiently, promoting performance and reducing code complexity.
// Benefits: Improved Performance, Reduced Memory Consumption, Simplified Object Creation
// [Singleton + Registry(Hashmap)] => To remove if-else statements (removes OCP)
// EG: 1) Invoice (Types - Sales, Purchase, Service); 2) User (Types - Admin, Reader, Writer)

package PrototypeRegister;

public class Client {
    public static void main(String[] args) {
        BotRegistry botRegistry = new BotRegistry();

        // Register the bots
        botRegistry.registerBot("CombatBot", new CombatBot("Combat Bot"));
        botRegistry.registerBot("MedicBot", new MedicBot("Medic Bot"));

        // Retrieve Cloned Bots from the registry
        Bot<CombatBot> clonedBot1 = botRegistry.createBot("CombatBot");

        Bot<CombatBot> bot2 = new CombatBot("Combat Bot");
        Bot<CombatBot> clonedBot2 = bot2.cloneBot();
    }
}
