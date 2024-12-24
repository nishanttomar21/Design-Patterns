package Factory.AbstractFactory;


import Factory.AbstractFactory.DatabaseConnection.Database;
import Factory.AbstractFactory.QueryExecutor.Query;

// Abstract Factory
public interface AbstractFactory {
    public Database createDatabase();
    public Query createQuery();
}
