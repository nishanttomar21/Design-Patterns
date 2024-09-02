package Singleton;

public class Singleton {
    private static Singleton singleton = null;

    // Set default values, perform validation, initialise resources (logger, database)
    private Singleton(){}   // Private constructor

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (singleton == null)
            synchronized(Singleton.class) {     // Double check-locking
                if (singleton == null)
                    singleton = new Singleton();
            }

        return singleton;
    }
}
