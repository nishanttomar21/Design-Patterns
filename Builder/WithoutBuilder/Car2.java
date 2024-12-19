// Setters vs Builder Pattern
//      Feature	                    Setters	                                                        Builder Pattern
//      Mutability	                Object is mutable, can change values later	                    Object is immutable after creation.
//      Object Construction	        Object is created in multiple steps (constructor + setters)	    All steps are done in a single flow.
//      Readability	                Readability may reduce for many optional parameters.	        Fluent API makes object construction readable.
//      Thread-Safety	            Requires extra care for thread safety.	                        Easy to make thread-safe with immutable objects.
//      Validation	                Harder to enforce field validation.	                            Validation logic can be encapsulated in the build() method.
//      Large Constructors	        Solves the issue partially by reducing constructor parameters.	Completely avoids large constructors.

package Builder.WithoutBuilder;

public class Car2 {
    private String engine;
    private int wheels;
    private boolean airbags;
    private boolean sunroof;

    // Constructor for required parameters
    public Car2(String engine, int wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    // Setters for optional parameters
    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
}
