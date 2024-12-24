package Factory.AbstractFactory.DatabaseConnection;

public class MongoDbConnection implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MongoDB DatabaseConnection!");
    }
}
