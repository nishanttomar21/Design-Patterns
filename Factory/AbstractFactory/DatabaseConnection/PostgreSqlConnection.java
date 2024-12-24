package Factory.AbstractFactory.DatabaseConnection;

public class PostgreSqlConnection implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL DatabaseConnection!");
    }
}
