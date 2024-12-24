package Factory.AbstractFactory;


import Factory.AbstractFactory.DatabaseConnection.Database;
import Factory.AbstractFactory.DatabaseConnection.MySqlConnection;
import Factory.AbstractFactory.QueryExecutor.MySqlQuery;
import Factory.AbstractFactory.QueryExecutor.Query;

public class MySqlFactory implements AbstractFactory {
    @Override
    public Database createDatabase() {
        return new MySqlConnection();
    }

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
