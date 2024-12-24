package Factory.AbstractFactory.DatabaseConnection;

public class MySqlConnection implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL DatabaseConnection!");
    }
}
