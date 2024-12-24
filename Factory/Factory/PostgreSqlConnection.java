package Factory.Factory;

public class PostgreSqlConnection implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL DatabaseConnection!");
    }
}
