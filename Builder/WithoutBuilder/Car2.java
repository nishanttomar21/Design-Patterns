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
