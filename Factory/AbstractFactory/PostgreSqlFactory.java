package Factory.AbstractFactory;


import Factory.AbstractFactory.DatabaseConnection.Database;
import Factory.AbstractFactory.DatabaseConnection.PostgreSqlConnection;
import Factory.AbstractFactory.QueryExecutor.PostgreSqlQuery;
import Factory.AbstractFactory.QueryExecutor.Query;

public class PostgreSqlFactory implements AbstractFactory {
    @Override
    public Database createDatabase() {
        return new PostgreSqlConnection();
    }

    @Override
    public Query createQuery() {
        return new PostgreSqlQuery();
    }
}
