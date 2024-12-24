package Factory.Factory;

public class DatabaseFactory {

    // Factory method to get the database object by passing the database type
    public static Database getDatabase(String databaseType) {
        return switch (databaseType.toLowerCase()) {
            case "postgresql" -> new PostgreSqlConnection();
            case "mysql" -> new MySqlConnection();
            case "mongodb" -> new MongoDbConnection();
            default -> null;
        };
    }
}
