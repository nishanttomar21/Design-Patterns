package Builder.WithBuilder;

public class Car {
    private String engine;
    private int wheels;
    private boolean airbags;
    private boolean sunroof;

    // Private constructor to enforce object creation via builder
    // Statement1: In Java, an inner class has access to the private fields of its outer class
    // Statement2: If the outer class has a reference to the inner class instance, it can access the inner class's variables, including private variables, through that reference
    private Car(Builder builder) {
        // Do validations here as well
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.airbags = builder.airbags;
        this.sunroof = builder.sunroof;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    // Implement Getters

    // Static nested Builder class
    public static class Builder {
        private String engine;
        private int wheels;
        private boolean airbags;
        private boolean sunroof;

        // Setters
        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;    // Returning the builder object
        }

        public Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setAirbags(boolean airbags) {
            this.airbags = airbags;
            return this;
        }

        public Builder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        // Method to build the Car object
        public Car build() {
            // Do validations here before creating the new Car object

            return new Car(this);
        }
    }
}