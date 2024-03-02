package design_patterns.creational.singletone;

class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

class Database {
    public static Database databaseInstance;
    private String connectionString;

    private Database(String connectionString){
        this.connectionString = connectionString;
    }

    public static Database getDatabaseInstance(String connectionString){
        if(databaseInstance == null){
            databaseInstance = new Database(connectionString);
        }
        return databaseInstance;
    }

    public String getConnectionString(){
        return connectionString;
    }
}

public class Main {
    public static void main(String[] args) {
        Database session1 = Database.getDatabaseInstance("value-1");
        System.out.println(session1.getConnectionString());

        // trying to create another Database session

        Database session2 = Database.getDatabaseInstance("value-2");
        System.out.println(session2.getConnectionString());
    }
}
