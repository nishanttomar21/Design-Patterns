package Factory.AbstractFactory;

import Factory.AbstractFactory.QueryExecutor.Query;
import Factory.AbstractFactory.DatabaseConnection.Database;
import Factory.AbstractFactory.DatabaseConnection.MongoDbConnection;
import Factory.AbstractFactory.QueryExecutor.MongoDbQuery;

public class MongoDbFactory implements AbstractFactory {
    @Override
    public Database createDatabase() {
        return new MongoDbConnection();
    }

    @Override
    public Query createQuery() {
        return new MongoDbQuery();
    }
}
