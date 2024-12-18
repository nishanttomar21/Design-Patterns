package Builder.WithoutBuilder;

public class Client {
    private static void main(String[] args) {
        // 1st way (Car object internal fields can be indirectly changed using Reflection, Subclassing, Mutable Fields) -- Mutable
        // Use a SecurityManager to prevent malicious reflection from modifying private fields.
        Car1 car1 = new Car1("V8", 4, true, true);

        // 2nd way (Car object internal fields can be directly changed) -- Mutable
        Car2 car2 = new Car2("V8", 4);
        car2.setAirbags(true);
        car2.setSunroof(true);
    }
}
